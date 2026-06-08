//
//  HybridNitroAmap.swift
//  Pods
//
//  Created by KayCM on 2026/6/8.
//

import Foundation
import UIKit

class HybridNitroAmap : HybridNitroAmapSpec {
  // UIView
  var view: UIView = UIView()

  // Props
  var isRed: Bool = false {
    didSet {
      view.backgroundColor = isRed ? .red : .black
    }
  }
}
