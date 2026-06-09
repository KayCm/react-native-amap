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


  mapView = MAMapView(frame: view.bounds)
//   mapView.delegate = self
  view.addSubview(mapView)

  // Props
  var isRed: Bool = false {
    didSet {
      view.backgroundColor = isRed ? .red : .black
    }
  }
}
