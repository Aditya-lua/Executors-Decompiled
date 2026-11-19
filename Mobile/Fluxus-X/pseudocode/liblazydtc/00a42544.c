/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a42544
 */

bool ossl_x25519(undefined1 *param_1,ulong *param_2,uint6 *param_3)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  uint uVar5;
  undefined1 auVar6 [16];
  undefined1 auVar7 [16];
  undefined1 auVar8 [16];
  undefined1 auVar9 [16];
  undefined1 auVar10 [16];
  undefined1 auVar11 [16];
  undefined1 auVar12 [16];
  undefined1 auVar13 [16];
  undefined1 auVar14 [16];
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  undefined1 auVar17 [16];
  undefined1 auVar18 [16];
  undefined1 auVar19 [16];
  undefined1 auVar20 [16];
  undefined1 auVar21 [16];
  undefined1 auVar22 [16];
  undefined1 auVar23 [16];
  undefined1 auVar24 [16];
  undefined1 auVar25 [16];
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  undefined1 auVar28 [16];
  undefined1 auVar29 [16];
  undefined1 auVar30 [16];
  undefined1 auVar31 [16];
  undefined1 auVar32 [16];
  undefined1 auVar33 [16];
  undefined1 auVar34 [16];
  undefined1 auVar35 [16];
  undefined1 auVar36 [16];
  undefined1 auVar37 [16];
  undefined1 auVar38 [16];
  undefined1 auVar39 [16];
  undefined1 auVar40 [16];
  undefined1 auVar41 [16];
  undefined1 auVar42 [16];
  undefined1 auVar43 [16];
  undefined1 auVar44 [16];
  undefined1 auVar45 [16];
  undefined1 auVar46 [16];
  undefined1 auVar47 [16];
  undefined1 auVar48 [16];
  undefined1 auVar49 [16];
  undefined1 auVar50 [16];
  undefined1 auVar51 [16];
  undefined1 auVar52 [16];
  undefined1 auVar53 [16];
  undefined1 auVar54 [16];
  undefined1 auVar55 [16];
  undefined1 auVar56 [16];
  undefined1 auVar57 [16];
  undefined1 auVar58 [16];
  undefined1 auVar59 [16];
  undefined1 auVar60 [16];
  undefined1 auVar61 [16];
  undefined1 auVar62 [16];
  undefined1 auVar63 [16];
  undefined1 auVar64 [16];
  undefined1 auVar65 [16];
  undefined1 auVar66 [16];
  undefined1 auVar67 [16];
  undefined1 auVar68 [16];
  undefined1 auVar69 [16];
  undefined1 auVar70 [16];
  undefined1 auVar71 [16];
  undefined1 auVar72 [16];
  undefined1 auVar73 [16];
  undefined1 auVar74 [16];
  undefined1 auVar75 [16];
  undefined1 auVar76 [16];
  undefined1 auVar77 [16];
  undefined1 auVar78 [16];
  undefined1 auVar79 [16];
  undefined1 auVar80 [16];
  undefined1 auVar81 [16];
  undefined1 auVar82 [16];
  undefined1 auVar83 [16];
  undefined1 auVar84 [16];
  undefined1 auVar85 [16];
  undefined1 auVar86 [16];
  undefined1 auVar87 [16];
  undefined1 auVar88 [16];
  undefined1 auVar89 [16];
  undefined1 auVar90 [16];
  undefined1 auVar91 [16];
  undefined1 auVar92 [16];
  undefined1 auVar93 [16];
  undefined1 auVar94 [16];
  undefined1 auVar95 [16];
  undefined1 auVar96 [16];
  undefined1 auVar97 [16];
  undefined1 auVar98 [16];
  undefined1 auVar99 [16];
  undefined1 auVar100 [16];
  undefined1 auVar101 [16];
  undefined1 auVar102 [16];
  undefined1 auVar103 [16];
  undefined1 auVar104 [16];
  undefined1 auVar105 [16];
  undefined1 auVar106 [16];
  undefined1 auVar107 [16];
  undefined1 auVar108 [16];
  undefined1 auVar109 [16];
  undefined1 auVar110 [16];
  undefined1 auVar111 [16];
  undefined1 auVar112 [16];
  undefined1 auVar113 [16];
  undefined1 auVar114 [16];
  undefined1 auVar115 [16];
  undefined1 auVar116 [16];
  undefined1 auVar117 [16];
  undefined1 auVar118 [16];
  undefined1 auVar119 [16];
  undefined1 auVar120 [16];
  undefined1 auVar121 [16];
  undefined1 auVar122 [16];
  undefined1 auVar123 [16];
  undefined1 auVar124 [16];
  undefined1 auVar125 [16];
  undefined1 auVar126 [16];
  undefined1 auVar127 [16];
  undefined1 auVar128 [16];
  undefined1 auVar129 [16];
  undefined1 auVar130 [16];
  undefined1 auVar131 [16];
  undefined1 auVar132 [16];
  undefined1 auVar133 [16];
  undefined1 auVar134 [16];
  undefined1 auVar135 [16];
  undefined1 auVar136 [16];
  undefined1 auVar137 [16];
  undefined1 auVar138 [16];
  undefined1 auVar139 [16];
  undefined1 auVar140 [16];
  undefined1 auVar141 [16];
  undefined1 auVar142 [16];
  undefined1 auVar143 [16];
  undefined1 auVar144 [16];
  undefined1 auVar145 [16];
  undefined1 auVar146 [16];
  undefined1 auVar147 [16];
  undefined1 auVar148 [16];
  undefined1 auVar149 [16];
  undefined1 auVar150 [16];
  undefined1 auVar151 [16];
  undefined1 auVar152 [16];
  undefined1 auVar153 [16];
  undefined1 auVar154 [16];
  undefined1 auVar155 [16];
  undefined1 auVar156 [16];
  undefined1 auVar157 [16];
  undefined1 auVar158 [16];
  undefined1 auVar159 [16];
  undefined1 auVar160 [16];
  undefined1 auVar161 [16];
  undefined1 auVar162 [16];
  undefined1 auVar163 [16];
  undefined1 auVar164 [16];
  undefined1 auVar165 [16];
  undefined1 auVar166 [16];
  undefined1 auVar167 [16];
  undefined1 auVar168 [16];
  undefined1 auVar169 [16];
  undefined1 auVar170 [16];
  undefined1 auVar171 [16];
  undefined1 auVar172 [16];
  undefined1 auVar173 [16];
  undefined1 auVar174 [16];
  undefined1 auVar175 [16];
  undefined1 auVar176 [16];
  undefined1 auVar177 [16];
  undefined1 auVar178 [16];
  undefined1 auVar179 [16];
  undefined1 auVar180 [16];
  undefined1 auVar181 [16];
  undefined1 auVar182 [16];
  undefined1 auVar183 [16];
  undefined1 auVar184 [16];
  undefined1 auVar185 [16];
  undefined1 auVar186 [16];
  undefined1 auVar187 [16];
  undefined1 auVar188 [16];
  undefined1 auVar189 [16];
  undefined1 auVar190 [16];
  undefined1 auVar191 [16];
  undefined1 auVar192 [16];
  undefined1 auVar193 [16];
  undefined1 auVar194 [16];
  undefined1 auVar195 [16];
  undefined1 auVar196 [16];
  undefined1 auVar197 [16];
  undefined1 auVar198 [16];
  undefined1 auVar199 [16];
  undefined1 auVar200 [16];
  undefined1 auVar201 [16];
  undefined1 auVar202 [16];
  undefined1 auVar203 [16];
  undefined1 auVar204 [16];
  undefined1 auVar205 [16];
  undefined1 auVar206 [16];
  undefined1 auVar207 [16];
  undefined1 auVar208 [16];
  undefined1 auVar209 [16];
  undefined1 auVar210 [16];
  undefined1 auVar211 [16];
  undefined1 auVar212 [16];
  undefined1 auVar213 [16];
  undefined1 auVar214 [16];
  undefined1 auVar215 [16];
  undefined1 auVar216 [16];
  undefined1 auVar217 [16];
  undefined1 auVar218 [16];
  undefined1 auVar219 [16];
  undefined1 auVar220 [16];
  undefined1 auVar221 [16];
  undefined1 auVar222 [16];
  undefined1 auVar223 [16];
  undefined1 auVar224 [16];
  undefined1 auVar225 [16];
  undefined1 auVar226 [16];
  undefined1 auVar227 [16];
  undefined1 auVar228 [16];
  undefined1 auVar229 [16];
  undefined1 auVar230 [16];
  undefined1 auVar231 [16];
  undefined1 auVar232 [16];
  undefined1 auVar233 [16];
  undefined1 auVar234 [16];
  undefined1 auVar235 [16];
  undefined1 auVar236 [16];
  undefined1 auVar237 [16];
  undefined1 auVar238 [16];
  undefined1 auVar239 [16];
  undefined1 auVar240 [16];
  undefined1 auVar241 [16];
  undefined1 auVar242 [16];
  undefined1 auVar243 [16];
  undefined1 auVar244 [16];
  undefined1 auVar245 [16];
  undefined1 auVar246 [16];
  undefined1 auVar247 [16];
  undefined1 auVar248 [16];
  undefined1 auVar249 [16];
  undefined1 auVar250 [16];
  undefined1 auVar251 [16];
  undefined1 auVar252 [16];
  undefined1 auVar253 [16];
  undefined1 auVar254 [16];
  undefined1 auVar255 [16];
  undefined1 auVar256 [16];
  undefined1 auVar257 [16];
  undefined1 auVar258 [16];
  undefined1 auVar259 [16];
  undefined1 auVar260 [16];
  undefined1 auVar261 [16];
  undefined1 auVar262 [16];
  undefined1 auVar263 [16];
  undefined1 auVar264 [16];
  undefined1 auVar265 [16];
  undefined1 auVar266 [16];
  undefined1 auVar267 [16];
  undefined1 auVar268 [16];
  undefined1 auVar269 [16];
  undefined1 auVar270 [16];
  undefined1 auVar271 [16];
  undefined1 auVar272 [16];
  undefined1 auVar273 [16];
  undefined1 auVar274 [16];
  undefined1 auVar275 [16];
  undefined1 auVar276 [16];
  undefined1 auVar277 [16];
  undefined1 auVar278 [16];
  undefined1 auVar279 [16];
  undefined1 auVar280 [16];
  undefined1 auVar281 [16];
  undefined1 auVar282 [16];
  undefined1 auVar283 [16];
  undefined1 auVar284 [16];
  undefined1 auVar285 [16];
  undefined1 auVar286 [16];
  undefined1 auVar287 [16];
  undefined1 auVar288 [16];
  undefined1 auVar289 [16];
  undefined1 auVar290 [16];
  undefined1 auVar291 [16];
  undefined1 auVar292 [16];
  undefined1 auVar293 [16];
  undefined1 auVar294 [16];
  undefined1 auVar295 [16];
  undefined1 auVar296 [16];
  undefined1 auVar297 [16];
  undefined1 auVar298 [16];
  undefined1 auVar299 [16];
  undefined1 auVar300 [16];
  undefined1 auVar301 [16];
  undefined1 auVar302 [16];
  undefined1 auVar303 [16];
  undefined1 auVar304 [16];
  undefined1 auVar305 [16];
  undefined1 auVar306 [16];
  undefined1 auVar307 [16];
  undefined1 auVar308 [16];
  undefined1 auVar309 [16];
  undefined1 auVar310 [16];
  undefined1 auVar311 [16];
  undefined1 auVar312 [16];
  undefined1 auVar313 [16];
  undefined1 auVar314 [16];
  undefined1 auVar315 [16];
  undefined1 auVar316 [16];
  undefined1 auVar317 [16];
  undefined1 auVar318 [16];
  undefined1 auVar319 [16];
  undefined1 auVar320 [16];
  undefined1 auVar321 [16];
  undefined1 auVar322 [16];
  undefined1 auVar323 [16];
  undefined1 auVar324 [16];
  undefined1 auVar325 [16];
  undefined1 auVar326 [16];
  undefined1 auVar327 [16];
  undefined1 auVar328 [16];
  undefined1 auVar329 [16];
  undefined1 auVar330 [16];
  undefined1 auVar331 [16];
  undefined1 auVar332 [16];
  undefined1 auVar333 [16];
  undefined1 auVar334 [16];
  undefined1 auVar335 [16];
  undefined1 auVar336 [16];
  undefined1 auVar337 [16];
  undefined1 auVar338 [16];
  undefined1 auVar339 [16];
  undefined1 auVar340 [16];
  undefined1 auVar341 [16];
  undefined1 auVar342 [16];
  undefined1 auVar343 [16];
  undefined1 auVar344 [16];
  undefined1 auVar345 [16];
  undefined1 auVar346 [16];
  undefined1 auVar347 [16];
  undefined1 auVar348 [16];
  undefined1 auVar349 [16];
  undefined1 auVar350 [16];
  undefined1 auVar351 [16];
  undefined1 auVar352 [16];
  undefined1 auVar353 [16];
  undefined1 auVar354 [16];
  undefined1 auVar355 [16];
  undefined1 auVar356 [16];
  undefined1 auVar357 [16];
  undefined1 auVar358 [16];
  undefined1 auVar359 [16];
  undefined1 auVar360 [16];
  undefined1 auVar361 [16];
  undefined1 auVar362 [16];
  undefined1 auVar363 [16];
  undefined1 auVar364 [16];
  undefined1 auVar365 [16];
  undefined1 auVar366 [16];
  undefined1 auVar367 [16];
  undefined1 auVar368 [16];
  undefined1 auVar369 [16];
  undefined1 auVar370 [16];
  undefined1 auVar371 [16];
  undefined1 auVar372 [16];
  undefined1 auVar373 [16];
  undefined1 auVar374 [16];
  undefined1 auVar375 [16];
  undefined1 auVar376 [16];
  undefined1 auVar377 [16];
  undefined1 auVar378 [16];
  undefined1 auVar379 [16];
  undefined1 auVar380 [16];
  undefined1 auVar381 [16];
  undefined1 auVar382 [16];
  undefined1 auVar383 [16];
  undefined1 auVar384 [16];
  undefined1 auVar385 [16];
  undefined1 auVar386 [16];
  undefined1 auVar387 [16];
  undefined1 auVar388 [16];
  undefined1 auVar389 [16];
  undefined1 auVar390 [16];
  undefined1 auVar391 [16];
  undefined1 auVar392 [16];
  undefined1 auVar393 [16];
  undefined1 auVar394 [16];
  undefined1 auVar395 [16];
  undefined1 auVar396 [16];
  undefined1 auVar397 [16];
  undefined1 auVar398 [16];
  undefined1 auVar399 [16];
  undefined1 auVar400 [16];
  undefined1 auVar401 [16];
  undefined1 auVar402 [16];
  undefined1 auVar403 [16];
  undefined1 auVar404 [16];
  undefined1 auVar405 [16];
  undefined1 auVar406 [16];
  undefined1 auVar407 [16];
  undefined1 auVar408 [16];
  undefined1 auVar409 [16];
  undefined1 auVar410 [16];
  undefined1 auVar411 [16];
  undefined1 auVar412 [16];
  undefined1 auVar413 [16];
  undefined1 auVar414 [16];
  undefined1 auVar415 [16];
  undefined1 auVar416 [16];
  undefined1 auVar417 [16];
  undefined1 auVar418 [16];
  undefined1 auVar419 [16];
  undefined1 auVar420 [16];
  undefined1 auVar421 [16];
  undefined1 auVar422 [16];
  undefined1 auVar423 [16];
  undefined1 auVar424 [16];
  undefined1 auVar425 [16];
  undefined1 auVar426 [16];
  undefined1 auVar427 [16];
  undefined1 auVar428 [16];
  undefined1 auVar429 [16];
  undefined1 auVar430 [16];
  undefined1 auVar431 [16];
  undefined1 auVar432 [16];
  undefined1 auVar433 [16];
  undefined1 auVar434 [16];
  undefined1 auVar435 [16];
  undefined1 auVar436 [16];
  undefined1 auVar437 [16];
  undefined1 auVar438 [16];
  undefined1 auVar439 [16];
  undefined1 auVar440 [16];
  undefined1 auVar441 [16];
  undefined1 auVar442 [16];
  undefined1 auVar443 [16];
  undefined1 auVar444 [16];
  undefined1 auVar445 [16];
  undefined1 auVar446 [16];
  undefined1 auVar447 [16];
  undefined1 auVar448 [16];
  undefined1 auVar449 [16];
  undefined1 auVar450 [16];
  undefined1 auVar451 [16];
  undefined1 auVar452 [16];
  undefined1 auVar453 [16];
  undefined1 auVar454 [16];
  undefined1 auVar455 [16];
  undefined1 auVar456 [16];
  undefined1 auVar457 [16];
  undefined1 auVar458 [16];
  undefined1 auVar459 [16];
  undefined1 auVar460 [16];
  undefined1 auVar461 [16];
  undefined1 auVar462 [16];
  undefined1 auVar463 [16];
  undefined1 auVar464 [16];
  undefined1 auVar465 [16];
  undefined1 auVar466 [16];
  undefined1 auVar467 [16];
  undefined1 auVar468 [16];
  undefined1 auVar469 [16];
  undefined1 auVar470 [16];
  undefined1 auVar471 [16];
  undefined1 auVar472 [16];
  undefined1 auVar473 [16];
  undefined1 auVar474 [16];
  undefined1 auVar475 [16];
  undefined1 auVar476 [16];
  undefined1 auVar477 [16];
  undefined1 auVar478 [16];
  undefined1 auVar479 [16];
  undefined1 auVar480 [16];
  undefined1 auVar481 [16];
  undefined1 auVar482 [16];
  undefined1 auVar483 [16];
  undefined1 auVar484 [16];
  undefined1 auVar485 [16];
  undefined1 auVar486 [16];
  undefined1 auVar487 [16];
  undefined1 auVar488 [16];
  undefined1 auVar489 [16];
  undefined1 auVar490 [16];
  undefined1 auVar491 [16];
  undefined1 auVar492 [16];
  undefined1 auVar493 [16];
  undefined1 auVar494 [16];
  undefined1 auVar495 [16];
  undefined1 auVar496 [16];
  undefined1 auVar497 [16];
  undefined1 auVar498 [16];
  undefined1 auVar499 [16];
  undefined1 auVar500 [16];
  undefined1 auVar501 [16];
  undefined1 auVar502 [16];
  undefined1 auVar503 [16];
  undefined1 auVar504 [16];
  undefined1 auVar505 [16];
  undefined1 auVar506 [16];
  undefined1 auVar507 [16];
  undefined1 auVar508 [16];
  undefined1 auVar509 [16];
  undefined1 auVar510 [16];
  undefined1 auVar511 [16];
  undefined1 auVar512 [16];
  undefined1 auVar513 [16];
  undefined1 auVar514 [16];
  undefined1 auVar515 [16];
  undefined1 auVar516 [16];
  undefined1 auVar517 [16];
  undefined1 auVar518 [16];
  undefined1 auVar519 [16];
  undefined1 auVar520 [16];
  undefined1 auVar521 [16];
  undefined1 auVar522 [16];
  undefined1 auVar523 [16];
  undefined1 auVar524 [16];
  undefined1 auVar525 [16];
  undefined1 auVar526 [16];
  undefined1 auVar527 [16];
  undefined1 auVar528 [16];
  undefined1 auVar529 [16];
  undefined1 auVar530 [16];
  undefined1 auVar531 [16];
  undefined1 auVar532 [16];
  undefined1 auVar533 [16];
  undefined1 auVar534 [16];
  undefined1 auVar535 [16];
  undefined1 auVar536 [16];
  undefined1 auVar537 [16];
  undefined1 auVar538 [16];
  undefined1 auVar539 [16];
  undefined1 auVar540 [16];
  undefined1 auVar541 [16];
  undefined1 auVar542 [16];
  undefined1 auVar543 [16];
  undefined1 auVar544 [16];
  undefined1 auVar545 [16];
  undefined1 auVar546 [16];
  undefined1 auVar547 [16];
  undefined1 auVar548 [16];
  undefined1 auVar549 [16];
  undefined1 auVar550 [16];
  undefined1 auVar551 [16];
  undefined1 auVar552 [16];
  undefined1 auVar553 [16];
  undefined1 auVar554 [16];
  undefined1 auVar555 [16];
  undefined1 auVar556 [16];
  undefined1 auVar557 [16];
  undefined1 auVar558 [16];
  undefined1 auVar559 [16];
  undefined1 auVar560 [16];
  undefined1 auVar561 [16];
  undefined1 auVar562 [16];
  undefined1 auVar563 [16];
  undefined1 auVar564 [16];
  undefined1 auVar565 [16];
  undefined1 auVar566 [16];
  undefined1 auVar567 [16];
  undefined1 auVar568 [16];
  undefined1 auVar569 [16];
  undefined1 auVar570 [16];
  undefined1 auVar571 [16];
  undefined1 auVar572 [16];
  undefined1 auVar573 [16];
  undefined1 auVar574 [16];
  undefined1 auVar575 [16];
  undefined1 auVar576 [16];
  undefined1 auVar577 [16];
  undefined1 auVar578 [16];
  undefined1 auVar579 [16];
  undefined1 auVar580 [16];
  undefined1 auVar581 [16];
  undefined1 auVar582 [16];
  undefined1 auVar583 [16];
  undefined1 auVar584 [16];
  undefined1 auVar585 [16];
  undefined1 auVar586 [16];
  undefined1 auVar587 [16];
  undefined1 auVar588 [16];
  undefined1 auVar589 [16];
  undefined1 auVar590 [16];
  undefined1 auVar591 [16];
  undefined1 auVar592 [16];
  undefined1 auVar593 [16];
  undefined1 auVar594 [16];
  undefined1 auVar595 [16];
  undefined1 auVar596 [16];
  undefined1 auVar597 [16];
  undefined1 auVar598 [16];
  undefined1 auVar599 [16];
  undefined1 auVar600 [16];
  undefined1 auVar601 [16];
  undefined1 auVar602 [16];
  undefined1 auVar603 [16];
  undefined1 auVar604 [16];
  undefined1 auVar605 [16];
  undefined1 auVar606 [16];
  undefined1 auVar607 [16];
  undefined1 auVar608 [16];
  undefined1 auVar609 [16];
  undefined1 auVar610 [16];
  undefined1 auVar611 [16];
  undefined1 auVar612 [16];
  undefined1 auVar613 [16];
  undefined1 auVar614 [16];
  undefined1 auVar615 [16];
  undefined1 auVar616 [16];
  undefined1 auVar617 [16];
  undefined1 auVar618 [16];
  undefined1 auVar619 [16];
  undefined1 auVar620 [16];
  undefined1 auVar621 [16];
  undefined1 auVar622 [16];
  undefined1 auVar623 [16];
  undefined1 auVar624 [16];
  undefined1 auVar625 [16];
  undefined1 auVar626 [16];
  undefined1 auVar627 [16];
  undefined1 auVar628 [16];
  undefined1 auVar629 [16];
  undefined1 auVar630 [16];
  undefined1 auVar631 [16];
  undefined1 auVar632 [16];
  undefined1 auVar633 [16];
  undefined1 auVar634 [16];
  undefined1 auVar635 [16];
  undefined1 auVar636 [16];
  undefined1 auVar637 [16];
  undefined1 auVar638 [16];
  undefined1 auVar639 [16];
  undefined1 auVar640 [16];
  int iVar641;
  ulong uVar642;
  ulong uVar643;
  ulong uVar644;
  ulong uVar645;
  uint uVar646;
  ulong uVar647;
  ulong uVar648;
  ulong uVar649;
  ulong uVar650;
  ulong uVar651;
  ulong uVar652;
  ulong uVar653;
  ulong uVar654;
  ulong uVar655;
  ulong uVar656;
  ulong uVar657;
  ulong uVar658;
  ulong uVar659;
  ulong uVar660;
  ulong uVar661;
  ulong uVar662;
  ulong uVar663;
  ulong uVar664;
  ulong uVar665;
  ulong uVar666;
  ulong uVar667;
  ulong uVar668;
  ulong uVar669;
  ulong uVar670;
  ulong uVar671;
  ulong uVar672;
  uint uVar673;
  ulong uVar674;
  ulong uVar675;
  ulong uVar676;
  ulong uVar677;
  ulong uVar678;
  ulong uVar679;
  ulong local_248;
  ulong local_240;
  ulong local_238;
  ulong local_230;
  ulong local_220;
  ulong uStack_218;
  ulong local_210;
  ulong uStack_208;
  ulong local_1f8;
  ulong uStack_1f0;
  ulong local_1e8;
  ulong uStack_1e0;
  ulong local_1d8;
  ulong local_1d0;
  long lStack_1c8;
  ulong local_1c0;
  long lStack_1b8;
  ulong local_1b0;
  ulong local_1a8;
  ulong uStack_1a0;
  ulong local_198;
  ulong uStack_190;
  ulong local_188;
  ulong local_180;
  ulong local_178;
  ulong local_170;
  ulong local_168;
  ulong local_160;
  ulong local_158;
  ulong uStack_150;
  ulong local_148;
  ulong local_140;
  ulong local_138;
  ulong local_130;
  ulong uStack_128;
  ulong local_120;
  ulong uStack_118;
  ulong local_110;
  ulong local_108;
  ulong uStack_100;
  ulong local_f8;
  ulong uStack_f0;
  ulong local_e8;
  ulong local_e0;
  ulong uStack_d8;
  ulong local_d0;
  ulong uStack_c8;
  ulong local_c0;
  ulong local_b8;
  ulong uStack_b0;
  ulong local_a8;
  ulong uStack_a0;
  ulong local_98;
  ulong local_90;
  ulong uStack_88;
  ulong local_80;
  ulong uStack_78;
  ulong local_70;
  
  local_248 = 0;
  local_240 = 0;
  local_238 = 0;
  local_230 = 0;
  uStack_218 = param_2[1];
  local_210 = param_2[2];
  local_220 = *param_2 & 0xfffffffffffffff8;
  uStack_208 = param_2[3] & 0x3fffffffffffffff | 0x4000000000000000;
  uVar651 = ((ulong)*(uint5 *)((long)param_3 + 0x1a) |
            ((ulong)*(byte *)((long)param_3 + 0x1f) & 0x7f) << 0x28) << 4 |
            (ulong)(*(byte *)((long)param_3 + 0x19) >> 4);
  uVar648 = ((ulong)*(uint6 *)((long)param_3 + 0xd) |
            ((ulong)*(byte *)((long)param_3 + 0x13) & 1) << 0x30) << 2 |
            (ulong)(*(byte *)((long)param_3 + 0xc) >> 6);
  uVar645 = ((ulong)*(uint5 *)((long)param_3 + 7) |
            ((ulong)*(byte *)((long)param_3 + 0xc) & 0x3f) << 0x28) << 5 |
            (ulong)(*(byte *)((long)param_3 + 6) >> 3);
  uVar673 = 0xfe;
  uVar642 = (ulong)*param_3 | ((ulong)*(byte *)((long)param_3 + 6) & 7) << 0x30;
  uVar658 = ((ulong)*(uint5 *)((long)param_3 + 0x14) |
            ((ulong)*(byte *)((long)param_3 + 0x19) & 0xf) << 0x28) << 7 |
            (ulong)(*(byte *)((long)param_3 + 0x13) >> 1);
  local_158 = 1;
  uStack_150 = 0;
  local_140 = 0;
  local_138 = 0;
  local_148 = 0;
  local_168 = 0;
  local_160 = 0;
  local_178 = 0;
  local_170 = 0;
  local_188 = 0;
  local_180 = 0;
  local_1a8 = 1;
  uStack_1a0 = 0;
  local_198 = 0;
  uStack_190 = 0;
  local_130 = uVar642;
  uStack_128 = uVar645;
  local_120 = uVar648;
  uStack_118 = uVar658;
  local_110 = uVar651;
  local_158 = 1;
  local_138 = 0;
  local_140 = 0;
  local_148 = 0;
  uStack_150 = 0;
  uStack_1a0 = 0;
  local_1a8 = 1;
  uStack_190 = 0;
  local_198 = 0;
  local_180 = 0;
  local_178 = 0;
  uVar646 = 0;
  while( true ) {
    uVar5 = *(byte *)((long)&local_220 + (ulong)(uVar673 >> 3)) >> (ulong)(uVar673 & 7) & 1;
    local_188 = -(ulong)(uVar5 ^ uVar646);
    uVar664 = (uVar642 ^ local_158) & local_188;
    uVar669 = (uVar645 ^ uStack_150) & local_188;
    uVar670 = (uVar648 ^ local_148) & local_188;
    uVar672 = (uVar658 ^ local_140) & local_188;
    uVar674 = (uVar651 ^ local_138) & local_188;
    uVar676 = (local_180 ^ local_1a8) & local_188;
    uVar678 = (local_178 ^ uStack_1a0) & local_188;
    uVar667 = (local_230 ^ local_198) & local_188;
    uVar679 = (local_238 ^ uStack_190) & local_188;
    local_188 = (local_240 ^ local_248) & local_188;
    uStack_150 = uVar669 ^ uStack_150;
    local_148 = uVar670 ^ local_148;
    uVar669 = uVar669 ^ uVar645;
    uVar670 = uVar670 ^ uVar648;
    local_158 = uVar664 ^ local_158;
    uVar664 = uVar664 ^ uVar642;
    local_140 = uVar672 ^ local_140;
    uVar672 = uVar672 ^ uVar658;
    local_138 = uVar674 ^ local_138;
    uVar674 = uVar674 ^ uVar651;
    uVar665 = uVar676 ^ local_180;
    local_1a8 = uVar676 ^ local_1a8;
    uVar652 = uVar678 ^ local_178;
    uStack_1a0 = uVar678 ^ uStack_1a0;
    local_230 = uVar667 ^ local_230;
    local_238 = uVar679 ^ local_238;
    local_240 = local_188 ^ local_240;
    local_188 = local_188 ^ local_248;
    local_198 = uVar667 ^ local_198;
    uStack_190 = uVar679 ^ uStack_190;
    local_178 = uStack_1a0 + uVar669;
    lStack_1c8 = (uVar669 + 0xffffffffffffe) - uStack_1a0;
    local_180 = local_1a8 + uVar664;
    local_1d0 = (uVar664 + 0xfffffffffffda) - local_1a8;
    local_170 = local_198 + uVar670;
    local_1c0 = (uVar670 + 0xffffffffffffe) - local_198;
    local_168 = uStack_190 + uVar672;
    lStack_1b8 = (uVar672 + 0xffffffffffffe) - uStack_190;
    local_160 = local_188 + uVar674;
    local_1b0 = (uVar674 + 0xffffffffffffe) - local_188;
    uVar648 = uVar665 + local_158;
    uVar658 = uVar652 + uStack_150;
    uVar645 = local_230 + local_148;
    uVar651 = local_238 + local_140;
    uVar642 = local_240 + local_138;
    uVar665 = (local_158 + 0xfffffffffffda) - uVar665;
    uVar652 = (uStack_150 + 0xffffffffffffe) - uVar652;
    local_230 = (local_148 + 0xffffffffffffe) - local_230;
    local_238 = (local_140 + 0xffffffffffffe) - local_238;
    local_240 = (local_138 + 0xffffffffffffe) - local_240;
    local_1f8 = uVar665;
    uStack_1f0 = uVar652;
    local_1e8 = local_230;
    uStack_1e0 = local_238;
    local_1d8 = local_240;
    local_158 = uVar648;
    uStack_150 = uVar658;
    local_148 = uVar645;
    local_140 = uVar651;
    local_138 = uVar642;
    FUN_00a46a4c(&local_1a8,&local_1d0,&local_158);
    FUN_00a46a4c(&local_180,&local_180,&local_1f8);
    uVar649 = uVar665 * 2;
    uVar650 = local_240 * 0x13;
    auVar6._8_8_ = 0;
    auVar6._0_8_ = uVar652;
    auVar326._8_8_ = 0;
    auVar326._0_8_ = uVar652;
    uVar655 = local_238 * 0x13;
    uVar670 = uVar649 * local_230 + uVar652 * uVar652;
    auVar7._8_8_ = 0;
    auVar7._0_8_ = uVar649;
    auVar327._8_8_ = 0;
    auVar327._0_8_ = local_230;
    auVar8._8_8_ = 0;
    auVar8._0_8_ = uVar665;
    auVar328._8_8_ = 0;
    auVar328._0_8_ = uVar665;
    uVar654 = uVar652 * 2;
    auVar9._8_8_ = 0;
    auVar9._0_8_ = uVar649;
    auVar329._8_8_ = 0;
    auVar329._0_8_ = uVar652;
    uVar664 = uVar655 * local_238 + uVar649 * uVar652;
    auVar10._8_8_ = 0;
    auVar10._0_8_ = uVar655;
    auVar330._8_8_ = 0;
    auVar330._0_8_ = local_238;
    uVar669 = local_180 + local_1a8;
    uVar668 = (local_1a8 + 0xfffffffffffda) - local_180;
    uVar674 = local_178 + uStack_1a0;
    uVar677 = (uStack_1a0 + 0xffffffffffffe) - local_178;
    uVar672 = local_170 + local_198;
    uVar675 = (local_198 + 0xffffffffffffe) - local_170;
    uVar667 = local_168 + uStack_190;
    uVar666 = (uStack_190 + 0xffffffffffffe) - local_168;
    uVar676 = local_160 + local_188;
    uVar671 = (local_188 + 0xffffffffffffe) - local_160;
    uVar660 = uVar650 * local_238 * 2;
    uVar678 = uVar670 + uVar660;
    uVar661 = local_230 * 2;
    auVar11._8_8_ = 0;
    auVar11._0_8_ = uVar650;
    auVar331._8_8_ = 0;
    auVar331._0_8_ = local_238 * 2;
    uVar679 = uVar655 * uVar661 + uVar665 * uVar665;
    auVar12._8_8_ = 0;
    auVar12._0_8_ = uVar655;
    auVar332._8_8_ = 0;
    auVar332._0_8_ = uVar661;
    uVar663 = uVar679 + uVar650 * uVar654;
    auVar13._8_8_ = 0;
    auVar13._0_8_ = uVar650;
    auVar333._8_8_ = 0;
    auVar333._0_8_ = uVar654;
    uVar659 = uVar664 + uVar650 * uVar661;
    auVar14._8_8_ = 0;
    auVar14._0_8_ = uVar650;
    auVar334._8_8_ = 0;
    auVar334._0_8_ = uVar661;
    auVar15._8_8_ = 0;
    auVar15._0_8_ = uVar649;
    auVar335._8_8_ = 0;
    auVar335._0_8_ = local_240;
    uVar657 = uVar649 * local_238 + uVar654 * local_230;
    auVar16._8_8_ = 0;
    auVar16._0_8_ = uVar650;
    auVar336._8_8_ = 0;
    auVar336._0_8_ = local_240;
    auVar17._8_8_ = 0;
    auVar17._0_8_ = uVar649;
    auVar337._8_8_ = 0;
    auVar337._0_8_ = local_238;
    auVar18._8_8_ = 0;
    auVar18._0_8_ = uVar654;
    auVar338._8_8_ = 0;
    auVar338._0_8_ = local_238;
    auVar19._8_8_ = 0;
    auVar19._0_8_ = uVar654;
    auVar339._8_8_ = 0;
    auVar339._0_8_ = local_230;
    uVar643 = uVar657 + uVar650 * local_240;
    uVar656 = uVar678 >> 0x33 |
              (SUB168(auVar7 * auVar327,8) + SUB168(auVar6 * auVar326,8) +
               (ulong)CARRY8(uVar649 * local_230,uVar652 * uVar652) + SUB168(auVar11 * auVar331,8) +
              (ulong)CARRY8(uVar670,uVar660)) * 0x2000;
    uVar670 = uVar643 + uVar656;
    uVar653 = uVar663 >> 0x33 |
              (SUB168(auVar12 * auVar332,8) + SUB168(auVar8 * auVar328,8) +
               (ulong)CARRY8(uVar655 * uVar661,uVar665 * uVar665) + SUB168(auVar13 * auVar333,8) +
              (ulong)CARRY8(uVar679,uVar650 * uVar654)) * 0x2000;
    uVar679 = uVar659 + uVar653;
    auVar20._8_8_ = 0;
    auVar20._0_8_ = local_230;
    auVar340._8_8_ = 0;
    auVar340._0_8_ = local_230;
    uVar660 = uVar654 * local_238 + local_230 * local_230;
    uVar665 = uVar660 + uVar649 * local_240;
    uVar656 = uVar670 >> 0x33 |
              (SUB168(auVar17 * auVar337,8) + SUB168(auVar19 * auVar339,8) +
               (ulong)CARRY8(uVar649 * local_238,uVar654 * local_230) + SUB168(auVar16 * auVar336,8)
               + (ulong)CARRY8(uVar657,uVar650 * local_240) + (ulong)CARRY8(uVar643,uVar656)) *
              0x2000;
    uVar657 = uVar665 + uVar656;
    auVar21._8_8_ = 0;
    auVar21._0_8_ = uVar648;
    auVar341._8_8_ = 0;
    auVar341._0_8_ = uVar648;
    uVar647 = uVar648 * 2;
    auVar22._8_8_ = 0;
    auVar22._0_8_ = uVar658;
    auVar342._8_8_ = 0;
    auVar342._0_8_ = uVar658;
    uVar644 = uVar651 * 0x13;
    uVar643 = uVar647 * uVar645 + uVar658 * uVar658;
    uVar654 = (uVar663 & 0x7ffffffffffff) +
              (uVar657 >> 0x33 |
              (SUB168(auVar18 * auVar338,8) + SUB168(auVar20 * auVar340,8) +
               (ulong)CARRY8(uVar654 * local_238,local_230 * local_230) +
               SUB168(auVar15 * auVar335,8) + (ulong)CARRY8(uVar660,uVar649 * local_240) +
              (ulong)CARRY8(uVar665,uVar656)) * 0x2000) * 0x13;
    auVar23._8_8_ = 0;
    auVar23._0_8_ = uVar647;
    auVar343._8_8_ = 0;
    auVar343._0_8_ = uVar645;
    uVar664 = (uVar678 & 0x7ffffffffffff) +
              (uVar679 >> 0x33 |
              (SUB168(auVar10 * auVar330,8) + SUB168(auVar9 * auVar329,8) +
               (ulong)CARRY8(uVar655 * local_238,uVar649 * uVar652) + SUB168(auVar14 * auVar334,8) +
               (ulong)CARRY8(uVar664,uVar650 * uVar661) + (ulong)CARRY8(uVar659,uVar653)) * 0x2000);
    uVar662 = uVar658 * 2;
    auVar24._8_8_ = 0;
    auVar24._0_8_ = uVar647;
    auVar344._8_8_ = 0;
    auVar344._0_8_ = uVar658;
    uVar655 = uVar642 * 0x13;
    uVar678 = uVar644 * uVar651 + uVar647 * uVar658;
    auVar25._8_8_ = 0;
    auVar25._0_8_ = uVar644;
    auVar345._8_8_ = 0;
    auVar345._0_8_ = uVar651;
    uVar650 = uVar655 * uVar651 * 2;
    uVar663 = uVar643 + uVar650;
    uVar652 = uVar645 * 2;
    auVar26._8_8_ = 0;
    auVar26._0_8_ = uVar655;
    auVar346._8_8_ = 0;
    auVar346._0_8_ = uVar651 * 2;
    uVar659 = uVar644 * uVar652 + uVar648 * uVar648;
    auVar27._8_8_ = 0;
    auVar27._0_8_ = uVar644;
    auVar347._8_8_ = 0;
    auVar347._0_8_ = uVar652;
    uVar660 = uVar659 + uVar655 * uVar662;
    auVar28._8_8_ = 0;
    auVar28._0_8_ = uVar655;
    auVar348._8_8_ = 0;
    auVar348._0_8_ = uVar662;
    uVar665 = uVar678 + uVar655 * uVar652;
    auVar29._8_8_ = 0;
    auVar29._0_8_ = uVar655;
    auVar349._8_8_ = 0;
    auVar349._0_8_ = uVar652;
    auVar30._8_8_ = 0;
    auVar30._0_8_ = uVar647;
    auVar350._8_8_ = 0;
    auVar350._0_8_ = uVar642;
    uVar649 = uVar647 * uVar651 + uVar662 * uVar645;
    auVar31._8_8_ = 0;
    auVar31._0_8_ = uVar655;
    auVar351._8_8_ = 0;
    auVar351._0_8_ = uVar642;
    auVar32._8_8_ = 0;
    auVar32._0_8_ = uVar647;
    auVar352._8_8_ = 0;
    auVar352._0_8_ = uVar651;
    auVar33._8_8_ = 0;
    auVar33._0_8_ = uVar662;
    auVar353._8_8_ = 0;
    auVar353._0_8_ = uVar651;
    auVar34._8_8_ = 0;
    auVar34._0_8_ = uVar662;
    auVar354._8_8_ = 0;
    auVar354._0_8_ = uVar645;
    uVar656 = uVar649 + uVar655 * uVar642;
    uVar653 = uVar663 >> 0x33 |
              (SUB168(auVar23 * auVar343,8) + SUB168(auVar22 * auVar342,8) +
               (ulong)CARRY8(uVar647 * uVar645,uVar658 * uVar658) + SUB168(auVar26 * auVar346,8) +
              (ulong)CARRY8(uVar643,uVar650)) * 0x2000;
    uVar643 = uVar656 + uVar653;
    uVar661 = uVar660 >> 0x33 |
              (SUB168(auVar27 * auVar347,8) + SUB168(auVar21 * auVar341,8) +
               (ulong)CARRY8(uVar644 * uVar652,uVar648 * uVar648) + SUB168(auVar28 * auVar348,8) +
              (ulong)CARRY8(uVar659,uVar655 * uVar662)) * 0x2000;
    uVar648 = uVar665 + uVar661;
    uVar659 = uVar662 * uVar651 + uVar645 * uVar645;
    auVar35._8_8_ = 0;
    auVar35._0_8_ = uVar645;
    auVar355._8_8_ = 0;
    auVar355._0_8_ = uVar645;
    uVar650 = uVar659 + uVar647 * uVar642;
    uVar658 = (uVar663 & 0x7ffffffffffff) +
              (uVar648 >> 0x33 |
              (SUB168(auVar25 * auVar345,8) + SUB168(auVar24 * auVar344,8) +
               (ulong)CARRY8(uVar644 * uVar651,uVar647 * uVar658) + SUB168(auVar29 * auVar349,8) +
               (ulong)CARRY8(uVar678,uVar655 * uVar652) + (ulong)CARRY8(uVar665,uVar661)) * 0x2000);
    uVar663 = uVar643 >> 0x33 |
              (SUB168(auVar32 * auVar352,8) + SUB168(auVar34 * auVar354,8) +
               (ulong)CARRY8(uVar647 * uVar651,uVar662 * uVar645) + SUB168(auVar31 * auVar351,8) +
               (ulong)CARRY8(uVar649,uVar655 * uVar642) + (ulong)CARRY8(uVar656,uVar653)) * 0x2000;
    uVar678 = uVar650 + uVar663;
    uVar644 = (uVar660 & 0x7ffffffffffff) +
              (uVar678 >> 0x33 |
              (SUB168(auVar33 * auVar353,8) + SUB168(auVar35 * auVar355,8) +
               (ulong)CARRY8(uVar662 * uVar651,uVar645 * uVar645) + SUB168(auVar30 * auVar350,8) +
               (ulong)CARRY8(uVar659,uVar647 * uVar642) + (ulong)CARRY8(uVar650,uVar663)) * 0x2000)
              * 0x13;
    lVar1 = (uVar670 & 0x7ffffffffffff) + (uVar664 >> 0x33);
    uVar664 = uVar664 & 0x7ffffffffffff;
    uVar657 = uVar657 & 0x7ffffffffffff;
    lVar2 = (uVar679 & 0x7ffffffffffff) + (uVar654 >> 0x33);
    uVar654 = uVar654 & 0x7ffffffffffff;
    lVar3 = (uVar643 & 0x7ffffffffffff) + (uVar658 >> 0x33);
    uVar678 = uVar678 & 0x7ffffffffffff;
    uVar658 = uVar658 & 0x7ffffffffffff;
    lVar4 = (uVar648 & 0x7ffffffffffff) + (uVar644 >> 0x33);
    uVar644 = uVar644 & 0x7ffffffffffff;
    local_1f8 = uVar644;
    uStack_1f0 = lVar4;
    local_1e8 = uVar658;
    uStack_1e0 = lVar3;
    local_1d8 = uVar678;
    local_1d0 = uVar654;
    lStack_1c8 = lVar2;
    local_1c0 = uVar664;
    lStack_1b8 = lVar1;
    local_1b0 = uVar657;
    local_180 = uVar668;
    local_178 = uVar677;
    FUN_00a46a4c(&local_158,&local_1f8,&local_1d0);
    uVar649 = uVar668 * 2;
    uVar656 = uVar671 * 0x13;
    auVar36._8_8_ = 0;
    auVar36._0_8_ = uVar677;
    auVar356._8_8_ = 0;
    auVar356._0_8_ = uVar677;
    uVar652 = uVar666 * 0x13;
    uVar648 = uVar675 * uVar649 + uVar677 * uVar677;
    auVar37._8_8_ = 0;
    auVar37._0_8_ = uVar675;
    auVar357._8_8_ = 0;
    auVar357._0_8_ = uVar649;
    auVar38._8_8_ = 0;
    auVar38._0_8_ = uVar677;
    auVar358._8_8_ = 0;
    auVar358._0_8_ = uVar649;
    uVar645 = uVar652 * uVar666 + uVar677 * uVar649;
    auVar39._8_8_ = 0;
    auVar39._0_8_ = uVar652;
    auVar359._8_8_ = 0;
    auVar359._0_8_ = uVar666;
    uVar643 = uVar656 * uVar666 * 2;
    uVar651 = uVar648 + uVar643;
    uVar660 = uVar675 * 2;
    auVar40._8_8_ = 0;
    auVar40._0_8_ = uVar656;
    auVar360._8_8_ = 0;
    auVar360._0_8_ = uVar666 * 2;
    auVar41._8_8_ = 0;
    auVar41._0_8_ = uVar668;
    auVar361._8_8_ = 0;
    auVar361._0_8_ = uVar668;
    uVar647 = uVar677 * 2;
    uVar642 = uVar652 * uVar660 + uVar668 * uVar668;
    auVar42._8_8_ = 0;
    auVar42._0_8_ = uVar652;
    auVar362._8_8_ = 0;
    auVar362._0_8_ = uVar660;
    uVar670 = uVar642 + uVar656 * uVar647;
    auVar43._8_8_ = 0;
    auVar43._0_8_ = uVar656;
    auVar363._8_8_ = 0;
    auVar363._0_8_ = uVar647;
    uVar679 = uVar645 + uVar656 * uVar660;
    auVar44._8_8_ = 0;
    auVar44._0_8_ = uVar656;
    auVar364._8_8_ = 0;
    auVar364._0_8_ = uVar660;
    auVar45._8_8_ = 0;
    auVar45._0_8_ = uVar671;
    auVar365._8_8_ = 0;
    auVar365._0_8_ = uVar649;
    uVar663 = uVar666 * uVar649 + uVar675 * uVar647;
    auVar46._8_8_ = 0;
    auVar46._0_8_ = uVar666;
    auVar366._8_8_ = 0;
    auVar366._0_8_ = uVar649;
    auVar47._8_8_ = 0;
    auVar47._0_8_ = uVar666;
    auVar367._8_8_ = 0;
    auVar367._0_8_ = uVar647;
    auVar48._8_8_ = 0;
    auVar48._0_8_ = uVar675;
    auVar368._8_8_ = 0;
    auVar368._0_8_ = uVar647;
    auVar49._8_8_ = 0;
    auVar49._0_8_ = uVar656;
    auVar369._8_8_ = 0;
    auVar369._0_8_ = uVar671;
    uVar659 = uVar663 + uVar656 * uVar671;
    uVar650 = uVar651 >> 0x33 |
              (SUB168(auVar37 * auVar357,8) + SUB168(auVar36 * auVar356,8) +
               (ulong)CARRY8(uVar675 * uVar649,uVar677 * uVar677) + SUB168(auVar40 * auVar360,8) +
              (ulong)CARRY8(uVar648,uVar643)) * 0x2000;
    uVar648 = uVar659 + uVar650;
    uVar665 = uVar670 >> 0x33 |
              (SUB168(auVar42 * auVar362,8) + SUB168(auVar41 * auVar361,8) +
               (ulong)CARRY8(uVar652 * uVar660,uVar668 * uVar668) + SUB168(auVar43 * auVar363,8) +
              (ulong)CARRY8(uVar642,uVar656 * uVar647)) * 0x2000;
    uVar642 = uVar679 + uVar665;
    uVar643 = uVar666 * uVar647 + uVar675 * uVar675;
    auVar50._8_8_ = 0;
    auVar50._0_8_ = uVar675;
    auVar370._8_8_ = 0;
    auVar370._0_8_ = uVar675;
    local_170 = (uVar651 & 0x7ffffffffffff) +
                (uVar642 >> 0x33 |
                (SUB168(auVar39 * auVar359,8) + SUB168(auVar38 * auVar358,8) +
                 (ulong)CARRY8(uVar652 * uVar666,uVar677 * uVar649) + SUB168(auVar44 * auVar364,8) +
                 (ulong)CARRY8(uVar645,uVar656 * uVar660) + (ulong)CARRY8(uVar679,uVar665)) * 0x2000
                );
    uVar645 = uVar643 + uVar671 * uVar649;
    uVar651 = uVar648 >> 0x33 |
              (SUB168(auVar46 * auVar366,8) + SUB168(auVar48 * auVar368,8) +
               (ulong)CARRY8(uVar666 * uVar649,uVar675 * uVar647) + SUB168(auVar49 * auVar369,8) +
               (ulong)CARRY8(uVar663,uVar656 * uVar671) + (ulong)CARRY8(uVar659,uVar650)) * 0x2000;
    local_160 = uVar645 + uVar651;
    local_1e8 = (uVar658 + 0xffffffffffffe) - uVar664;
    uStack_1e0 = (lVar3 + 0xffffffffffffe) - lVar1;
    local_180 = (uVar670 & 0x7ffffffffffff) +
                (local_160 >> 0x33 |
                (SUB168(auVar47 * auVar367,8) + SUB168(auVar50 * auVar370,8) +
                 (ulong)CARRY8(uVar666 * uVar647,uVar675 * uVar675) + SUB168(auVar45 * auVar365,8) +
                 (ulong)CARRY8(uVar643,uVar671 * uVar649) + (ulong)CARRY8(uVar645,uVar651)) * 0x2000
                ) * 0x13;
    auVar51._8_8_ = 0;
    auVar51._0_8_ = local_1e8;
    uVar651 = SUB168(auVar51 * ZEXT816(0x1db42),8);
    local_178 = (uVar642 & 0x7ffffffffffff) + (local_180 >> 0x33);
    local_180 = local_180 & 0x7ffffffffffff;
    local_1f8 = (uVar644 + 0xfffffffffffda) - uVar654;
    uStack_1f0 = (lVar4 + 0xffffffffffffe) - lVar2;
    uVar645 = local_1e8 * 0x1db42 >> 0x33 | uVar651 << 0xd;
    uVar658 = uStack_1e0 * 0x1db42 + uVar645;
    auVar52._8_8_ = 0;
    auVar52._0_8_ = local_1f8;
    uVar642 = SUB168(auVar52 * ZEXT816(0x1db42),8);
    auVar53._8_8_ = 0;
    auVar53._0_8_ = uStack_1e0;
    uVar679 = SUB168(auVar53 * ZEXT816(0x1db42),8) + (uVar651 >> 0x33) +
              (ulong)CARRY8(uStack_1e0 * 0x1db42,uVar645);
    uVar651 = local_1f8 * 0x1db42 >> 0x33 | uVar642 << 0xd;
    uVar645 = uStack_1f0 * 0x1db42 + uVar651;
    local_168 = (uVar648 & 0x7ffffffffffff) + (local_170 >> 0x33);
    local_170 = local_170 & 0x7ffffffffffff;
    local_1d8 = (uVar678 + 0xffffffffffffe) - uVar657;
    auVar54._8_8_ = 0;
    auVar54._0_8_ = uStack_1f0;
    local_160 = local_160 & 0x7ffffffffffff;
    uVar670 = uVar658 >> 0x33 | uVar679 * 0x2000;
    auVar55._8_8_ = 0;
    auVar55._0_8_ = uVar674;
    auVar371._8_8_ = 0;
    auVar371._0_8_ = uVar674;
    uVar648 = uVar670 + local_1d8 * 0x1db42;
    auVar56._8_8_ = 0;
    auVar56._0_8_ = local_1d8;
    uVar643 = uVar669 * 2;
    local_188 = uVar648 & 0x7ffffffffffff;
    local_198 = (local_1e8 * 0x1db42 & 0x7fffffffffffe) +
                (uVar645 >> 0x33 |
                (SUB168(auVar54 * ZEXT816(0x1db42),8) + (uVar642 >> 0x33) +
                (ulong)CARRY8(uStack_1f0 * 0x1db42,uVar651)) * 0x2000);
    local_1a8 = (local_1f8 * 0x1db42 & 0x7fffffffffffe) +
                (uVar648 >> 0x33 |
                ((uVar679 >> 0x33) + SUB168(auVar56 * ZEXT816(0x1db42),8) +
                (ulong)CARRY8(uVar670,local_1d8 * 0x1db42)) * 0x2000) * 0x13;
    auVar57._8_8_ = 0;
    auVar57._0_8_ = uVar672;
    auVar372._8_8_ = 0;
    auVar372._0_8_ = uVar643;
    local_1b0 = local_188 + uVar657;
    uVar649 = uVar667 * 0x13;
    uVar648 = uVar672 * uVar643 + uVar674 * uVar674;
    uStack_190 = (uVar658 & 0x7ffffffffffff) + (local_198 >> 0x33);
    local_198 = local_198 & 0x7ffffffffffff;
    uVar658 = uVar649 * uVar667 + uVar674 * uVar643;
    local_1c0 = local_198 + uVar664;
    lStack_1b8 = uStack_190 + lVar1;
    auVar58._8_8_ = 0;
    auVar58._0_8_ = uVar674;
    auVar373._8_8_ = 0;
    auVar373._0_8_ = uVar643;
    auVar59._8_8_ = 0;
    auVar59._0_8_ = uVar649;
    auVar374._8_8_ = 0;
    auVar374._0_8_ = uVar667;
    uVar660 = uVar676 * 0x13;
    uStack_1a0 = (uVar645 & 0x7ffffffffffff) + (local_1a8 >> 0x33);
    local_1a8 = local_1a8 & 0x7ffffffffffff;
    uVar679 = uVar660 * uVar667 * 2;
    lStack_1c8 = uStack_1a0 + lVar2;
    uVar645 = uVar648 + uVar679;
    uVar656 = uVar672 * 2;
    auVar60._8_8_ = 0;
    auVar60._0_8_ = uVar660;
    auVar375._8_8_ = 0;
    auVar375._0_8_ = uVar667 * 2;
    local_1d0 = local_1a8 + uVar654;
    auVar61._8_8_ = 0;
    auVar61._0_8_ = uVar669;
    auVar376._8_8_ = 0;
    auVar376._0_8_ = uVar669;
    uVar665 = uVar674 * 2;
    uVar651 = uVar649 * uVar656 + uVar669 * uVar669;
    auVar62._8_8_ = 0;
    auVar62._0_8_ = uVar649;
    auVar377._8_8_ = 0;
    auVar377._0_8_ = uVar656;
    uVar642 = uVar651 + uVar660 * uVar665;
    auVar63._8_8_ = 0;
    auVar63._0_8_ = uVar660;
    auVar378._8_8_ = 0;
    auVar378._0_8_ = uVar665;
    uVar670 = uVar658 + uVar660 * uVar656;
    auVar64._8_8_ = 0;
    auVar64._0_8_ = uVar660;
    auVar379._8_8_ = 0;
    auVar379._0_8_ = uVar656;
    auVar65._8_8_ = 0;
    auVar65._0_8_ = uVar667;
    auVar380._8_8_ = 0;
    auVar380._0_8_ = uVar643;
    auVar66._8_8_ = 0;
    auVar66._0_8_ = uVar676;
    auVar381._8_8_ = 0;
    auVar381._0_8_ = uVar643;
    uVar664 = uVar667 * uVar643 + uVar672 * uVar665;
    auVar67._8_8_ = 0;
    auVar67._0_8_ = uVar667;
    auVar382._8_8_ = 0;
    auVar382._0_8_ = uVar665;
    auVar68._8_8_ = 0;
    auVar68._0_8_ = uVar672;
    auVar383._8_8_ = 0;
    auVar383._0_8_ = uVar665;
    auVar69._8_8_ = 0;
    auVar69._0_8_ = uVar660;
    auVar384._8_8_ = 0;
    auVar384._0_8_ = uVar676;
    uVar678 = uVar664 + uVar660 * uVar676;
    uVar657 = uVar645 >> 0x33 |
              (SUB168(auVar57 * auVar372,8) + SUB168(auVar55 * auVar371,8) +
               (ulong)CARRY8(uVar672 * uVar643,uVar674 * uVar674) + SUB168(auVar60 * auVar375,8) +
              (ulong)CARRY8(uVar648,uVar679)) * 0x2000;
    uVar679 = uVar678 + uVar657;
    uVar648 = uVar642 >> 0x33 |
              (SUB168(auVar62 * auVar377,8) + SUB168(auVar61 * auVar376,8) +
               (ulong)CARRY8(uVar649 * uVar656,uVar669 * uVar669) + SUB168(auVar63 * auVar378,8) +
              (ulong)CARRY8(uVar651,uVar660 * uVar665)) * 0x2000;
    uVar669 = uVar670 + uVar648;
    uVar663 = uVar667 * uVar665 + uVar672 * uVar672;
    auVar70._8_8_ = 0;
    auVar70._0_8_ = uVar672;
    auVar385._8_8_ = 0;
    auVar385._0_8_ = uVar672;
    uVar659 = uVar663 + uVar676 * uVar643;
    uVar664 = uVar679 >> 0x33 |
              (SUB168(auVar65 * auVar380,8) + SUB168(auVar68 * auVar383,8) +
               (ulong)CARRY8(uVar667 * uVar643,uVar672 * uVar665) + SUB168(auVar69 * auVar384,8) +
               (ulong)CARRY8(uVar664,uVar660 * uVar676) + (ulong)CARRY8(uVar678,uVar657)) * 0x2000;
    uVar651 = uVar659 + uVar664;
    FUN_00a46a4c(&local_1a8,&local_130,&local_180);
    FUN_00a46a4c(&local_180,&local_1f8,&local_1d0);
    if (uVar673 == 0) break;
    local_230 = local_170;
    uVar648 = (uVar645 & 0x7ffffffffffff) +
              (uVar669 >> 0x33 |
              (SUB168(auVar59 * auVar374,8) + SUB168(auVar58 * auVar373,8) +
               (ulong)CARRY8(uVar649 * uVar667,uVar674 * uVar643) + SUB168(auVar64 * auVar379,8) +
               (ulong)CARRY8(uVar658,uVar660 * uVar656) + (ulong)CARRY8(uVar670,uVar648)) * 0x2000);
    local_238 = local_168;
    local_240 = local_160;
    uVar658 = (uVar679 & 0x7ffffffffffff) + (uVar648 >> 0x33);
    uVar642 = (uVar642 & 0x7ffffffffffff) +
              (uVar651 >> 0x33 |
              (SUB168(auVar67 * auVar382,8) + SUB168(auVar70 * auVar385,8) +
               (ulong)CARRY8(uVar667 * uVar665,uVar672 * uVar672) + SUB168(auVar66 * auVar381,8) +
               (ulong)CARRY8(uVar663,uVar676 * uVar643) + (ulong)CARRY8(uVar659,uVar664)) * 0x2000)
              * 0x13;
    uVar673 = uVar673 - 1;
    local_248 = local_188;
    uVar645 = (uVar669 & 0x7ffffffffffff) + (uVar642 >> 0x33);
    uVar642 = uVar642 & 0x7ffffffffffff;
    uVar648 = uVar648 & 0x7ffffffffffff;
    uVar651 = uVar651 & 0x7ffffffffffff;
    uVar646 = uVar5;
  }
  auVar71._8_8_ = 0;
  auVar71._0_8_ = local_180;
  auVar386._8_8_ = 0;
  auVar386._0_8_ = local_180;
  uVar678 = local_180 * 2;
  auVar72._8_8_ = 0;
  auVar72._0_8_ = local_178;
  auVar387._8_8_ = 0;
  auVar387._0_8_ = local_178;
  uVar657 = local_178 * 2;
  uVar667 = local_168 * 0x13;
  auVar73._8_8_ = 0;
  auVar73._0_8_ = local_170;
  auVar388._8_8_ = 0;
  auVar388._0_8_ = uVar678;
  uVar648 = local_170 * uVar678 + local_178 * local_178;
  auVar74._8_8_ = 0;
  auVar74._0_8_ = uVar678;
  auVar389._8_8_ = 0;
  auVar389._0_8_ = local_178;
  auVar75._8_8_ = 0;
  auVar75._0_8_ = local_168;
  auVar390._8_8_ = 0;
  auVar390._0_8_ = uVar678;
  auVar76._8_8_ = 0;
  auVar76._0_8_ = local_168;
  auVar391._8_8_ = 0;
  auVar391._0_8_ = uVar657;
  auVar77._8_8_ = 0;
  auVar77._0_8_ = uVar667;
  auVar392._8_8_ = 0;
  auVar392._0_8_ = local_168;
  uVar663 = local_160 * 0x13;
  uVar658 = uVar667 * local_168 + uVar678 * local_178;
  auVar78._8_8_ = 0;
  auVar78._0_8_ = uVar663;
  auVar393._8_8_ = 0;
  auVar393._0_8_ = local_168 * 2;
  uVar664 = uVar663 * local_168 * 2;
  uVar676 = local_170 * 2;
  uVar645 = uVar648 + uVar664;
  auVar79._8_8_ = 0;
  auVar79._0_8_ = uVar667;
  auVar394._8_8_ = 0;
  auVar394._0_8_ = uVar676;
  uVar651 = uVar667 * uVar676 + local_180 * local_180;
  auVar80._8_8_ = 0;
  auVar80._0_8_ = local_160;
  auVar395._8_8_ = 0;
  auVar395._0_8_ = uVar678;
  auVar81._8_8_ = 0;
  auVar81._0_8_ = uVar663;
  auVar396._8_8_ = 0;
  auVar396._0_8_ = local_160;
  auVar82._8_8_ = 0;
  auVar82._0_8_ = uVar663;
  auVar397._8_8_ = 0;
  auVar397._0_8_ = uVar657;
  auVar83._8_8_ = 0;
  auVar83._0_8_ = uVar663;
  auVar398._8_8_ = 0;
  auVar398._0_8_ = uVar676;
  uVar642 = uVar651 + uVar663 * uVar657;
  uVar670 = uVar658 + uVar663 * uVar676;
  auVar84._8_8_ = 0;
  auVar84._0_8_ = uVar657;
  auVar399._8_8_ = 0;
  auVar399._0_8_ = local_170;
  uVar679 = uVar642 >> 0x33 |
            (SUB168(auVar79 * auVar394,8) + SUB168(auVar71 * auVar386,8) +
             (ulong)CARRY8(uVar667 * uVar676,local_180 * local_180) + SUB168(auVar82 * auVar397,8) +
            (ulong)CARRY8(uVar651,uVar663 * uVar657)) * 0x2000;
  uVar651 = local_168 * uVar678 + uVar657 * local_170;
  uVar659 = uVar645 >> 0x33 |
            (SUB168(auVar73 * auVar388,8) + SUB168(auVar72 * auVar387,8) +
             (ulong)CARRY8(local_170 * uVar678,local_178 * local_178) + SUB168(auVar78 * auVar393,8)
            + (ulong)CARRY8(uVar648,uVar664)) * 0x2000;
  uVar648 = uVar651 + uVar663 * local_160;
  uVar664 = uVar648 + uVar659;
  uVar669 = uVar670 + uVar679;
  auVar85._8_8_ = 0;
  auVar85._0_8_ = local_170;
  auVar400._8_8_ = 0;
  auVar400._0_8_ = local_170;
  uVar674 = local_168 * uVar657 + local_170 * local_170;
  uVar672 = uVar674 + local_160 * uVar678;
  uVar651 = uVar664 >> 0x33 |
            (SUB168(auVar75 * auVar390,8) + SUB168(auVar84 * auVar399,8) +
             (ulong)CARRY8(local_168 * uVar678,uVar657 * local_170) + SUB168(auVar81 * auVar396,8) +
             (ulong)CARRY8(uVar651,uVar663 * local_160) + (ulong)CARRY8(uVar648,uVar659)) * 0x2000;
  uVar648 = uVar672 + uVar651;
  local_80 = (uVar645 & 0x7ffffffffffff) +
             (uVar669 >> 0x33 |
             (SUB168(auVar77 * auVar392,8) + SUB168(auVar74 * auVar389,8) +
              (ulong)CARRY8(uVar667 * local_168,uVar678 * local_178) + SUB168(auVar83 * auVar398,8)
              + (ulong)CARRY8(uVar658,uVar663 * uVar676) + (ulong)CARRY8(uVar670,uVar679)) * 0x2000)
  ;
  local_70 = uVar648 & 0x7ffffffffffff;
  uStack_78 = (uVar664 & 0x7ffffffffffff) + (local_80 >> 0x33);
  local_90 = (uVar642 & 0x7ffffffffffff) +
             (uVar648 >> 0x33 |
             (SUB168(auVar76 * auVar391,8) + SUB168(auVar85 * auVar400,8) +
              (ulong)CARRY8(local_168 * uVar657,local_170 * local_170) +
              SUB168(auVar80 * auVar395,8) + (ulong)CARRY8(uVar674,local_160 * uVar678) +
             (ulong)CARRY8(uVar672,uVar651)) * 0x2000) * 0x13;
  uVar678 = local_70 * 0x13;
  uStack_88 = (uVar669 & 0x7ffffffffffff) + (local_90 >> 0x33);
  auVar86._8_8_ = 0;
  auVar86._0_8_ = uVar678;
  auVar401._8_8_ = 0;
  auVar401._0_8_ = uStack_78 * 2;
  uVar651 = uVar678 * uStack_78 * 2;
  local_90 = local_90 & 0x7ffffffffffff;
  local_80 = local_80 & 0x7ffffffffffff;
  uVar667 = local_90 * 2;
  auVar87._8_8_ = 0;
  auVar87._0_8_ = uStack_88;
  auVar402._8_8_ = 0;
  auVar402._0_8_ = uStack_88;
  uVar648 = uStack_88 * uStack_88 + uVar651;
  uVar679 = uStack_78 * 0x13;
  uVar659 = local_80 * 2;
  auVar88._8_8_ = 0;
  auVar88._0_8_ = uVar667;
  auVar403._8_8_ = 0;
  auVar403._0_8_ = local_80;
  uVar658 = uVar648 + uVar667 * local_80;
  auVar89._8_8_ = 0;
  auVar89._0_8_ = uVar679;
  auVar404._8_8_ = 0;
  auVar404._0_8_ = uStack_78;
  auVar90._8_8_ = 0;
  auVar90._0_8_ = uVar679;
  auVar405._8_8_ = 0;
  auVar405._0_8_ = uVar659;
  auVar91._8_8_ = 0;
  auVar91._0_8_ = local_90;
  auVar406._8_8_ = 0;
  auVar406._0_8_ = local_90;
  uVar657 = uStack_88 * 2;
  uVar645 = local_90 * local_90 + uVar679 * uVar659;
  auVar92._8_8_ = 0;
  auVar92._0_8_ = uVar678;
  auVar407._8_8_ = 0;
  auVar407._0_8_ = local_70;
  auVar93._8_8_ = 0;
  auVar93._0_8_ = uVar678;
  auVar408._8_8_ = 0;
  auVar408._0_8_ = uVar659;
  auVar94._8_8_ = 0;
  auVar94._0_8_ = uVar657;
  auVar409._8_8_ = 0;
  auVar409._0_8_ = uVar678;
  uVar663 = uVar658 >> 0x33 |
            (SUB168(auVar87 * auVar402,8) + SUB168(auVar86 * auVar401,8) +
             (ulong)CARRY8(uStack_88 * uStack_88,uVar651) + SUB168(auVar88 * auVar403,8) +
            (ulong)CARRY8(uVar648,uVar667 * local_80)) * 0x2000;
  uVar648 = uVar645 + uVar657 * uVar678;
  auVar95._8_8_ = 0;
  auVar95._0_8_ = uVar667;
  auVar410._8_8_ = 0;
  auVar410._0_8_ = uStack_78;
  uVar651 = uVar667 * uStack_78 + uVar678 * local_70;
  auVar96._8_8_ = 0;
  auVar96._0_8_ = uVar667;
  auVar411._8_8_ = 0;
  auVar411._0_8_ = uStack_88;
  auVar97._8_8_ = 0;
  auVar97._0_8_ = uVar667;
  auVar412._8_8_ = 0;
  auVar412._0_8_ = local_70;
  auVar98._8_8_ = 0;
  auVar98._0_8_ = uVar657;
  auVar413._8_8_ = 0;
  auVar413._0_8_ = local_80;
  auVar99._8_8_ = 0;
  auVar99._0_8_ = uVar657;
  auVar414._8_8_ = 0;
  auVar414._0_8_ = uStack_78;
  uVar676 = uVar648 >> 0x33 |
            (SUB168(auVar91 * auVar406,8) + SUB168(auVar90 * auVar405,8) +
             (ulong)CARRY8(local_90 * local_90,uVar679 * uVar659) + SUB168(auVar94 * auVar409,8) +
            (ulong)CARRY8(uVar645,uVar657 * uVar678)) * 0x2000;
  uVar645 = uVar651 + uVar657 * local_80;
  uVar642 = uVar645 + uVar663;
  uVar670 = uVar678 * uVar659 + uVar679 * uStack_78;
  uVar664 = uVar670 + uVar667 * uStack_88;
  uVar669 = uVar664 + uVar676;
  auVar100._8_8_ = 0;
  auVar100._0_8_ = local_80;
  auVar415._8_8_ = 0;
  auVar415._0_8_ = local_80;
  uVar674 = uVar667 * local_70 + local_80 * local_80;
  uVar672 = uVar674 + uVar657 * uStack_78;
  uVar663 = uVar642 >> 0x33 |
            (SUB168(auVar95 * auVar410,8) + SUB168(auVar92 * auVar407,8) +
             (ulong)CARRY8(uVar667 * uStack_78,uVar678 * local_70) + SUB168(auVar98 * auVar413,8) +
             (ulong)CARRY8(uVar651,uVar657 * local_80) + (ulong)CARRY8(uVar645,uVar663)) * 0x2000;
  uVar645 = uVar672 + uVar663;
  uVar658 = (uVar658 & 0x7ffffffffffff) +
            (uVar669 >> 0x33 |
            (SUB168(auVar93 * auVar408,8) + SUB168(auVar89 * auVar404,8) +
             (ulong)CARRY8(uVar678 * uVar659,uVar679 * uStack_78) + SUB168(auVar96 * auVar411,8) +
             (ulong)CARRY8(uVar670,uVar667 * uStack_88) + (ulong)CARRY8(uVar664,uVar676)) * 0x2000);
  uVar679 = uVar645 & 0x7ffffffffffff;
  uVar651 = (uVar642 & 0x7ffffffffffff) + (uVar658 >> 0x33);
  uVar674 = (uVar648 & 0x7ffffffffffff) +
            (uVar645 >> 0x33 |
            (SUB168(auVar97 * auVar412,8) + SUB168(auVar100 * auVar415,8) +
             (ulong)CARRY8(uVar667 * local_70,local_80 * local_80) + SUB168(auVar99 * auVar414,8) +
             (ulong)CARRY8(uVar674,uVar657 * uStack_78) + (ulong)CARRY8(uVar672,uVar663)) * 0x2000)
            * 0x13;
  uVar657 = uVar679 * 0x13;
  uVar648 = (uVar669 & 0x7ffffffffffff) + (uVar674 >> 0x33);
  auVar101._8_8_ = 0;
  auVar101._0_8_ = uVar657;
  auVar416._8_8_ = 0;
  auVar416._0_8_ = uVar651 * 2;
  uVar664 = uVar657 * uVar651 * 2;
  uVar674 = uVar674 & 0x7ffffffffffff;
  uVar658 = uVar658 & 0x7ffffffffffff;
  uVar663 = uVar674 * 2;
  auVar102._8_8_ = 0;
  auVar102._0_8_ = uVar648;
  auVar417._8_8_ = 0;
  auVar417._0_8_ = uVar648;
  uVar645 = uVar648 * uVar648 + uVar664;
  uVar643 = uVar651 * 0x13;
  uVar665 = uVar658 * 2;
  auVar103._8_8_ = 0;
  auVar103._0_8_ = uVar663;
  auVar418._8_8_ = 0;
  auVar418._0_8_ = uVar658;
  uVar642 = uVar645 + uVar663 * uVar658;
  auVar104._8_8_ = 0;
  auVar104._0_8_ = uVar643;
  auVar419._8_8_ = 0;
  auVar419._0_8_ = uVar651;
  auVar105._8_8_ = 0;
  auVar105._0_8_ = uVar643;
  auVar420._8_8_ = 0;
  auVar420._0_8_ = uVar665;
  auVar106._8_8_ = 0;
  auVar106._0_8_ = uVar674;
  auVar421._8_8_ = 0;
  auVar421._0_8_ = uVar674;
  uVar649 = uVar648 * 2;
  uVar670 = uVar674 * uVar674 + uVar643 * uVar665;
  auVar107._8_8_ = 0;
  auVar107._0_8_ = uVar657;
  auVar422._8_8_ = 0;
  auVar422._0_8_ = uVar679;
  auVar108._8_8_ = 0;
  auVar108._0_8_ = uVar657;
  auVar423._8_8_ = 0;
  auVar423._0_8_ = uVar665;
  auVar109._8_8_ = 0;
  auVar109._0_8_ = uVar649;
  auVar424._8_8_ = 0;
  auVar424._0_8_ = uVar657;
  uVar660 = uVar642 >> 0x33 |
            (SUB168(auVar102 * auVar417,8) + SUB168(auVar101 * auVar416,8) +
             (ulong)CARRY8(uVar648 * uVar648,uVar664) + SUB168(auVar103 * auVar418,8) +
            (ulong)CARRY8(uVar645,uVar663 * uVar658)) * 0x2000;
  uVar645 = uVar670 + uVar649 * uVar657;
  auVar110._8_8_ = 0;
  auVar110._0_8_ = uVar663;
  auVar425._8_8_ = 0;
  auVar425._0_8_ = uVar651;
  uVar664 = uVar663 * uVar651 + uVar657 * uVar679;
  auVar111._8_8_ = 0;
  auVar111._0_8_ = uVar663;
  auVar426._8_8_ = 0;
  auVar426._0_8_ = uVar648;
  auVar112._8_8_ = 0;
  auVar112._0_8_ = uVar663;
  auVar427._8_8_ = 0;
  auVar427._0_8_ = uVar679;
  auVar113._8_8_ = 0;
  auVar113._0_8_ = uVar649;
  auVar428._8_8_ = 0;
  auVar428._0_8_ = uVar658;
  auVar114._8_8_ = 0;
  auVar114._0_8_ = uVar649;
  auVar429._8_8_ = 0;
  auVar429._0_8_ = uVar651;
  uVar659 = uVar645 >> 0x33 |
            (SUB168(auVar106 * auVar421,8) + SUB168(auVar105 * auVar420,8) +
             (ulong)CARRY8(uVar674 * uVar674,uVar643 * uVar665) + SUB168(auVar109 * auVar424,8) +
            (ulong)CARRY8(uVar670,uVar649 * uVar657)) * 0x2000;
  uVar670 = uVar664 + uVar649 * uVar658;
  uVar669 = uVar670 + uVar660;
  uVar674 = uVar657 * uVar665 + uVar643 * uVar651;
  uVar672 = uVar674 + uVar663 * uVar648;
  uVar667 = uVar672 + uVar659;
  auVar115._8_8_ = 0;
  auVar115._0_8_ = uVar658;
  auVar430._8_8_ = 0;
  auVar430._0_8_ = uVar658;
  uVar676 = uVar663 * uVar679 + uVar658 * uVar658;
  uVar678 = uVar676 + uVar649 * uVar651;
  uVar664 = uVar669 >> 0x33 |
            (SUB168(auVar110 * auVar425,8) + SUB168(auVar107 * auVar422,8) +
             (ulong)CARRY8(uVar663 * uVar651,uVar657 * uVar679) + SUB168(auVar113 * auVar428,8) +
             (ulong)CARRY8(uVar664,uVar649 * uVar658) + (ulong)CARRY8(uVar670,uVar660)) * 0x2000;
  uVar670 = uVar678 + uVar664;
  local_98 = uVar670 & 0x7ffffffffffff;
  local_a8 = (uVar642 & 0x7ffffffffffff) +
             (uVar667 >> 0x33 |
             (SUB168(auVar108 * auVar423,8) + SUB168(auVar104 * auVar419,8) +
              (ulong)CARRY8(uVar657 * uVar665,uVar643 * uVar651) + SUB168(auVar111 * auVar426,8) +
              (ulong)CARRY8(uVar674,uVar663 * uVar648) + (ulong)CARRY8(uVar672,uVar659)) * 0x2000);
  local_b8 = (uVar645 & 0x7ffffffffffff) +
             (uVar670 >> 0x33 |
             (SUB168(auVar112 * auVar427,8) + SUB168(auVar115 * auVar430,8) +
              (ulong)CARRY8(uVar663 * uVar679,uVar658 * uVar658) + SUB168(auVar114 * auVar429,8) +
              (ulong)CARRY8(uVar676,uVar649 * uVar651) + (ulong)CARRY8(uVar678,uVar664)) * 0x2000) *
             0x13;
  uStack_a0 = (uVar669 & 0x7ffffffffffff) + (local_a8 >> 0x33);
  local_a8 = local_a8 & 0x7ffffffffffff;
  uStack_b0 = (uVar667 & 0x7ffffffffffff) + (local_b8 >> 0x33);
  local_b8 = local_b8 & 0x7ffffffffffff;
  FUN_00a46a4c(&local_b8,&local_180,&local_b8);
  FUN_00a46a4c(&local_90,&local_90,&local_b8);
  auVar116._8_8_ = 0;
  auVar116._0_8_ = local_90;
  auVar431._8_8_ = 0;
  auVar431._0_8_ = local_90;
  uVar678 = local_90 * 2;
  auVar117._8_8_ = 0;
  auVar117._0_8_ = uStack_88;
  auVar432._8_8_ = 0;
  auVar432._0_8_ = uStack_88;
  uVar667 = uStack_78 * 0x13;
  auVar118._8_8_ = 0;
  auVar118._0_8_ = local_80;
  auVar433._8_8_ = 0;
  auVar433._0_8_ = uVar678;
  uVar648 = local_80 * uVar678 + uStack_88 * uStack_88;
  uVar657 = uStack_88 * 2;
  auVar119._8_8_ = 0;
  auVar119._0_8_ = uVar678;
  auVar434._8_8_ = 0;
  auVar434._0_8_ = uStack_88;
  uVar663 = local_70 * 0x13;
  auVar120._8_8_ = 0;
  auVar120._0_8_ = uStack_78;
  auVar435._8_8_ = 0;
  auVar435._0_8_ = uVar678;
  auVar121._8_8_ = 0;
  auVar121._0_8_ = uStack_78;
  auVar436._8_8_ = 0;
  auVar436._0_8_ = uVar657;
  uVar658 = uVar667 * uStack_78 + uVar678 * uStack_88;
  auVar122._8_8_ = 0;
  auVar122._0_8_ = uVar667;
  auVar437._8_8_ = 0;
  auVar437._0_8_ = uStack_78;
  auVar123._8_8_ = 0;
  auVar123._0_8_ = uVar663;
  auVar438._8_8_ = 0;
  auVar438._0_8_ = uStack_78 * 2;
  uVar664 = uVar663 * uStack_78 * 2;
  uVar676 = local_80 * 2;
  uVar645 = uVar648 + uVar664;
  auVar124._8_8_ = 0;
  auVar124._0_8_ = uVar667;
  auVar439._8_8_ = 0;
  auVar439._0_8_ = uVar676;
  uVar651 = uVar667 * uVar676 + local_90 * local_90;
  auVar125._8_8_ = 0;
  auVar125._0_8_ = local_70;
  auVar440._8_8_ = 0;
  auVar440._0_8_ = uVar678;
  auVar126._8_8_ = 0;
  auVar126._0_8_ = uVar663;
  auVar441._8_8_ = 0;
  auVar441._0_8_ = local_70;
  auVar127._8_8_ = 0;
  auVar127._0_8_ = uVar663;
  auVar442._8_8_ = 0;
  auVar442._0_8_ = uVar657;
  auVar128._8_8_ = 0;
  auVar128._0_8_ = uVar663;
  auVar443._8_8_ = 0;
  auVar443._0_8_ = uVar676;
  uVar642 = uVar651 + uVar663 * uVar657;
  uVar670 = uVar658 + uVar663 * uVar676;
  auVar129._8_8_ = 0;
  auVar129._0_8_ = uVar657;
  auVar444._8_8_ = 0;
  auVar444._0_8_ = local_80;
  uVar679 = uVar642 >> 0x33 |
            (SUB168(auVar124 * auVar439,8) + SUB168(auVar116 * auVar431,8) +
             (ulong)CARRY8(uVar667 * uVar676,local_90 * local_90) + SUB168(auVar127 * auVar442,8) +
            (ulong)CARRY8(uVar651,uVar663 * uVar657)) * 0x2000;
  uVar651 = uStack_78 * uVar678 + uVar657 * local_80;
  uVar659 = uVar645 >> 0x33 |
            (SUB168(auVar118 * auVar433,8) + SUB168(auVar117 * auVar432,8) +
             (ulong)CARRY8(local_80 * uVar678,uStack_88 * uStack_88) + SUB168(auVar123 * auVar438,8)
            + (ulong)CARRY8(uVar648,uVar664)) * 0x2000;
  uVar648 = uVar651 + uVar663 * local_70;
  uVar664 = uVar648 + uVar659;
  uVar669 = uVar670 + uVar679;
  auVar130._8_8_ = 0;
  auVar130._0_8_ = local_80;
  auVar445._8_8_ = 0;
  auVar445._0_8_ = local_80;
  uVar674 = uStack_78 * uVar657 + local_80 * local_80;
  uVar672 = uVar674 + local_70 * uVar678;
  uVar651 = uVar664 >> 0x33 |
            (SUB168(auVar120 * auVar435,8) + SUB168(auVar129 * auVar444,8) +
             (ulong)CARRY8(uStack_78 * uVar678,uVar657 * local_80) + SUB168(auVar126 * auVar441,8) +
             (ulong)CARRY8(uVar651,uVar663 * local_70) + (ulong)CARRY8(uVar648,uVar659)) * 0x2000;
  uVar648 = uVar672 + uVar651;
  local_c0 = uVar648 & 0x7ffffffffffff;
  local_d0 = (uVar645 & 0x7ffffffffffff) +
             (uVar669 >> 0x33 |
             (SUB168(auVar122 * auVar437,8) + SUB168(auVar119 * auVar434,8) +
              (ulong)CARRY8(uVar667 * uStack_78,uVar678 * uStack_88) + SUB168(auVar128 * auVar443,8)
              + (ulong)CARRY8(uVar658,uVar663 * uVar676) + (ulong)CARRY8(uVar670,uVar679)) * 0x2000)
  ;
  local_e0 = (uVar642 & 0x7ffffffffffff) +
             (uVar648 >> 0x33 |
             (SUB168(auVar121 * auVar436,8) + SUB168(auVar130 * auVar445,8) +
              (ulong)CARRY8(uStack_78 * uVar657,local_80 * local_80) + SUB168(auVar125 * auVar440,8)
              + (ulong)CARRY8(uVar674,local_70 * uVar678) + (ulong)CARRY8(uVar672,uVar651)) * 0x2000
             ) * 0x13;
  uStack_c8 = (uVar664 & 0x7ffffffffffff) + (local_d0 >> 0x33);
  local_d0 = local_d0 & 0x7ffffffffffff;
  uStack_d8 = (uVar669 & 0x7ffffffffffff) + (local_e0 >> 0x33);
  local_e0 = local_e0 & 0x7ffffffffffff;
  FUN_00a46a4c(&local_b8,&local_b8,&local_e0);
  auVar131._8_8_ = 0;
  auVar131._0_8_ = local_b8;
  auVar446._8_8_ = 0;
  auVar446._0_8_ = local_b8;
  uVar678 = local_b8 * 2;
  auVar132._8_8_ = 0;
  auVar132._0_8_ = uStack_b0;
  auVar447._8_8_ = 0;
  auVar447._0_8_ = uStack_b0;
  uVar667 = uStack_a0 * 0x13;
  auVar133._8_8_ = 0;
  auVar133._0_8_ = local_a8;
  auVar448._8_8_ = 0;
  auVar448._0_8_ = uVar678;
  uVar648 = local_a8 * uVar678 + uStack_b0 * uStack_b0;
  uVar657 = uStack_b0 * 2;
  auVar134._8_8_ = 0;
  auVar134._0_8_ = uVar678;
  auVar449._8_8_ = 0;
  auVar449._0_8_ = uStack_b0;
  uVar663 = local_98 * 0x13;
  auVar135._8_8_ = 0;
  auVar135._0_8_ = uStack_a0;
  auVar450._8_8_ = 0;
  auVar450._0_8_ = uVar678;
  auVar136._8_8_ = 0;
  auVar136._0_8_ = uStack_a0;
  auVar451._8_8_ = 0;
  auVar451._0_8_ = uVar657;
  uVar658 = uVar667 * uStack_a0 + uVar678 * uStack_b0;
  auVar137._8_8_ = 0;
  auVar137._0_8_ = uVar667;
  auVar452._8_8_ = 0;
  auVar452._0_8_ = uStack_a0;
  auVar138._8_8_ = 0;
  auVar138._0_8_ = uVar663;
  auVar453._8_8_ = 0;
  auVar453._0_8_ = uStack_a0 * 2;
  uVar664 = uVar663 * uStack_a0 * 2;
  uVar676 = local_a8 * 2;
  uVar645 = uVar648 + uVar664;
  auVar139._8_8_ = 0;
  auVar139._0_8_ = uVar667;
  auVar454._8_8_ = 0;
  auVar454._0_8_ = uVar676;
  uVar651 = uVar667 * uVar676 + local_b8 * local_b8;
  auVar140._8_8_ = 0;
  auVar140._0_8_ = local_98;
  auVar455._8_8_ = 0;
  auVar455._0_8_ = uVar678;
  auVar141._8_8_ = 0;
  auVar141._0_8_ = uVar663;
  auVar456._8_8_ = 0;
  auVar456._0_8_ = local_98;
  auVar142._8_8_ = 0;
  auVar142._0_8_ = uVar663;
  auVar457._8_8_ = 0;
  auVar457._0_8_ = uVar657;
  auVar143._8_8_ = 0;
  auVar143._0_8_ = uVar663;
  auVar458._8_8_ = 0;
  auVar458._0_8_ = uVar676;
  uVar642 = uVar651 + uVar663 * uVar657;
  uVar670 = uVar658 + uVar663 * uVar676;
  auVar144._8_8_ = 0;
  auVar144._0_8_ = uVar657;
  auVar459._8_8_ = 0;
  auVar459._0_8_ = local_a8;
  uVar679 = uVar642 >> 0x33 |
            (SUB168(auVar139 * auVar454,8) + SUB168(auVar131 * auVar446,8) +
             (ulong)CARRY8(uVar667 * uVar676,local_b8 * local_b8) + SUB168(auVar142 * auVar457,8) +
            (ulong)CARRY8(uVar651,uVar663 * uVar657)) * 0x2000;
  uVar651 = uStack_a0 * uVar678 + uVar657 * local_a8;
  uVar659 = uVar645 >> 0x33 |
            (SUB168(auVar133 * auVar448,8) + SUB168(auVar132 * auVar447,8) +
             (ulong)CARRY8(local_a8 * uVar678,uStack_b0 * uStack_b0) + SUB168(auVar138 * auVar453,8)
            + (ulong)CARRY8(uVar648,uVar664)) * 0x2000;
  uVar648 = uVar651 + uVar663 * local_98;
  uVar664 = uVar648 + uVar659;
  uVar669 = uVar670 + uVar679;
  auVar145._8_8_ = 0;
  auVar145._0_8_ = local_a8;
  auVar460._8_8_ = 0;
  auVar460._0_8_ = local_a8;
  uVar674 = uStack_a0 * uVar657 + local_a8 * local_a8;
  uVar672 = uVar674 + local_98 * uVar678;
  uVar651 = uVar664 >> 0x33 |
            (SUB168(auVar135 * auVar450,8) + SUB168(auVar144 * auVar459,8) +
             (ulong)CARRY8(uStack_a0 * uVar678,uVar657 * local_a8) + SUB168(auVar141 * auVar456,8) +
             (ulong)CARRY8(uVar651,uVar663 * local_98) + (ulong)CARRY8(uVar648,uVar659)) * 0x2000;
  uVar648 = uVar672 + uVar651;
  local_c0 = uVar648 & 0x7ffffffffffff;
  local_d0 = (uVar645 & 0x7ffffffffffff) +
             (uVar669 >> 0x33 |
             (SUB168(auVar137 * auVar452,8) + SUB168(auVar134 * auVar449,8) +
              (ulong)CARRY8(uVar667 * uStack_a0,uVar678 * uStack_b0) + SUB168(auVar143 * auVar458,8)
              + (ulong)CARRY8(uVar658,uVar663 * uVar676) + (ulong)CARRY8(uVar670,uVar679)) * 0x2000)
  ;
  local_e0 = (uVar642 & 0x7ffffffffffff) +
             (uVar648 >> 0x33 |
             (SUB168(auVar136 * auVar451,8) + SUB168(auVar145 * auVar460,8) +
              (ulong)CARRY8(uStack_a0 * uVar657,local_a8 * local_a8) + SUB168(auVar140 * auVar455,8)
              + (ulong)CARRY8(uVar674,local_98 * uVar678) + (ulong)CARRY8(uVar672,uVar651)) * 0x2000
             ) * 0x13;
  uStack_c8 = (uVar664 & 0x7ffffffffffff) + (local_d0 >> 0x33);
  local_d0 = local_d0 & 0x7ffffffffffff;
  uStack_d8 = (uVar669 & 0x7ffffffffffff) + (local_e0 >> 0x33);
  local_e0 = local_e0 & 0x7ffffffffffff;
  iVar641 = 4;
  do {
    uVar657 = local_c0 * 0x13;
    uVar670 = uStack_c8 * 2 * uVar657;
    auVar146._8_8_ = 0;
    auVar146._0_8_ = local_e0;
    auVar461._8_8_ = 0;
    auVar461._0_8_ = local_e0;
    uVar679 = local_e0 * 2;
    auVar147._8_8_ = 0;
    auVar147._0_8_ = uStack_d8;
    auVar462._8_8_ = 0;
    auVar462._0_8_ = uStack_d8;
    uVar648 = uStack_d8 * uStack_d8 + uVar670;
    auVar148._8_8_ = 0;
    auVar148._0_8_ = uStack_c8 * 2;
    auVar463._8_8_ = 0;
    auVar463._0_8_ = uVar657;
    uVar672 = uStack_d8 * 2;
    uVar667 = uStack_c8 * 0x13;
    uVar676 = local_d0 * 2;
    auVar149._8_8_ = 0;
    auVar149._0_8_ = uVar679;
    auVar464._8_8_ = 0;
    auVar464._0_8_ = local_d0;
    uVar658 = uVar648 + uVar679 * local_d0;
    auVar150._8_8_ = 0;
    auVar150._0_8_ = uVar679;
    auVar465._8_8_ = 0;
    auVar465._0_8_ = uStack_c8;
    auVar151._8_8_ = 0;
    auVar151._0_8_ = uVar672;
    auVar466._8_8_ = 0;
    auVar466._0_8_ = uStack_c8;
    auVar152._8_8_ = 0;
    auVar152._0_8_ = uVar667;
    auVar467._8_8_ = 0;
    auVar467._0_8_ = uStack_c8;
    auVar153._8_8_ = 0;
    auVar153._0_8_ = uVar676;
    auVar468._8_8_ = 0;
    auVar468._0_8_ = uVar667;
    uVar645 = local_e0 * local_e0 + uVar676 * uVar667;
    auVar154._8_8_ = 0;
    auVar154._0_8_ = uVar679;
    auVar469._8_8_ = 0;
    auVar469._0_8_ = uStack_d8;
    auVar155._8_8_ = 0;
    auVar155._0_8_ = uVar679;
    auVar470._8_8_ = 0;
    auVar470._0_8_ = local_c0;
    uVar663 = uVar679 * local_c0;
    auVar156._8_8_ = 0;
    auVar156._0_8_ = uVar657;
    auVar471._8_8_ = 0;
    auVar471._0_8_ = local_c0;
    auVar157._8_8_ = 0;
    auVar157._0_8_ = uVar672;
    auVar472._8_8_ = 0;
    auVar472._0_8_ = uVar657;
    auVar158._8_8_ = 0;
    auVar158._0_8_ = uVar676;
    auVar473._8_8_ = 0;
    auVar473._0_8_ = uVar657;
    uVar651 = uVar645 + uVar672 * uVar657;
    auVar159._8_8_ = 0;
    auVar159._0_8_ = uVar672;
    auVar474._8_8_ = 0;
    auVar474._0_8_ = local_d0;
    uVar642 = uVar672 * local_d0 + uVar657 * local_c0;
    uVar659 = uVar651 >> 0x33 |
              (SUB168(auVar146 * auVar461,8) + SUB168(auVar153 * auVar468,8) +
               (ulong)CARRY8(local_e0 * local_e0,uVar676 * uVar667) + SUB168(auVar157 * auVar472,8)
              + (ulong)CARRY8(uVar645,uVar672 * uVar657)) * 0x2000;
    uVar645 = uVar642 + uVar679 * uStack_c8;
    uVar664 = uVar658 >> 0x33 |
              (SUB168(auVar147 * auVar462,8) + SUB168(auVar148 * auVar463,8) +
               (ulong)CARRY8(uStack_d8 * uStack_d8,uVar670) + SUB168(auVar149 * auVar464,8) +
              (ulong)CARRY8(uVar648,uVar679 * local_d0)) * 0x2000;
    uVar648 = uVar645 + uVar664;
    uVar670 = uVar676 * uVar657 + uVar667 * uStack_c8;
    uVar678 = uVar648 >> 0x33 |
              (SUB168(auVar159 * auVar474,8) + SUB168(auVar156 * auVar471,8) +
               (ulong)CARRY8(uVar672 * local_d0,uVar657 * local_c0) + SUB168(auVar150 * auVar465,8)
               + (ulong)CARRY8(uVar642,uVar679 * uStack_c8) + (ulong)CARRY8(uVar645,uVar664)) *
              0x2000;
    uVar645 = uVar670 + uVar679 * uStack_d8;
    uVar642 = uVar645 + uVar659;
    auVar160._8_8_ = 0;
    auVar160._0_8_ = local_d0;
    auVar475._8_8_ = 0;
    auVar475._0_8_ = local_d0;
    uVar664 = uVar672 * uStack_c8 + local_d0 * local_d0;
    uVar669 = uVar664 + uVar663;
    uVar674 = uVar669 + uVar678;
    uVar658 = (uVar658 & 0x7ffffffffffff) +
              (uVar642 >> 0x33 |
              (SUB168(auVar158 * auVar473,8) + SUB168(auVar152 * auVar467,8) +
               (ulong)CARRY8(uVar676 * uVar657,uVar667 * uStack_c8) + SUB168(auVar154 * auVar469,8)
               + (ulong)CARRY8(uVar670,uVar679 * uStack_d8) + (ulong)CARRY8(uVar645,uVar659)) *
              0x2000);
    local_c0 = uVar674 & 0x7ffffffffffff;
    local_e0 = (uVar651 & 0x7ffffffffffff) +
               (uVar674 >> 0x33 |
               (SUB168(auVar151 * auVar466,8) + SUB168(auVar160 * auVar475,8) +
                (ulong)CARRY8(uVar672 * uStack_c8,local_d0 * local_d0) +
                SUB168(auVar155 * auVar470,8) + (ulong)CARRY8(uVar664,uVar663) +
               (ulong)CARRY8(uVar669,uVar678)) * 0x2000) * 0x13;
    uStack_c8 = (uVar648 & 0x7ffffffffffff) + (uVar658 >> 0x33);
    local_d0 = uVar658 & 0x7ffffffffffff;
    iVar641 = iVar641 + -1;
    uStack_d8 = (uVar642 & 0x7ffffffffffff) + (local_e0 >> 0x33);
    local_e0 = local_e0 & 0x7ffffffffffff;
  } while (iVar641 != 0);
  FUN_00a46a4c(&local_b8,&local_e0,&local_b8);
  auVar161._8_8_ = 0;
  auVar161._0_8_ = local_b8;
  auVar476._8_8_ = 0;
  auVar476._0_8_ = local_b8;
  uVar679 = local_b8 * 2;
  auVar162._8_8_ = 0;
  auVar162._0_8_ = uStack_b0;
  auVar477._8_8_ = 0;
  auVar477._0_8_ = uStack_b0;
  uVar676 = uStack_a0 * 0x13;
  auVar163._8_8_ = 0;
  auVar163._0_8_ = local_a8;
  auVar478._8_8_ = 0;
  auVar478._0_8_ = uVar679;
  uVar648 = local_a8 * uVar679 + uStack_b0 * uStack_b0;
  uVar667 = uStack_b0 * 2;
  auVar164._8_8_ = 0;
  auVar164._0_8_ = uVar679;
  auVar479._8_8_ = 0;
  auVar479._0_8_ = uStack_b0;
  uVar659 = local_98 * 0x13;
  auVar165._8_8_ = 0;
  auVar165._0_8_ = uStack_a0;
  auVar480._8_8_ = 0;
  auVar480._0_8_ = uVar679;
  auVar166._8_8_ = 0;
  auVar166._0_8_ = uStack_a0;
  auVar481._8_8_ = 0;
  auVar481._0_8_ = uVar667;
  uVar658 = uVar676 * uStack_a0 + uVar679 * uStack_b0;
  auVar167._8_8_ = 0;
  auVar167._0_8_ = uVar676;
  auVar482._8_8_ = 0;
  auVar482._0_8_ = uStack_a0;
  auVar168._8_8_ = 0;
  auVar168._0_8_ = uVar659;
  auVar483._8_8_ = 0;
  auVar483._0_8_ = uStack_a0 * 2;
  uVar664 = uVar659 * uStack_a0 * 2;
  uVar678 = local_a8 * 2;
  uVar645 = uVar648 + uVar664;
  auVar169._8_8_ = 0;
  auVar169._0_8_ = uVar676;
  auVar484._8_8_ = 0;
  auVar484._0_8_ = uVar678;
  uVar651 = uVar676 * uVar678 + local_b8 * local_b8;
  auVar170._8_8_ = 0;
  auVar170._0_8_ = local_98;
  auVar485._8_8_ = 0;
  auVar485._0_8_ = uVar679;
  auVar171._8_8_ = 0;
  auVar171._0_8_ = uVar659;
  auVar486._8_8_ = 0;
  auVar486._0_8_ = local_98;
  auVar172._8_8_ = 0;
  auVar172._0_8_ = uVar659;
  auVar487._8_8_ = 0;
  auVar487._0_8_ = uVar667;
  auVar173._8_8_ = 0;
  auVar173._0_8_ = uVar659;
  auVar488._8_8_ = 0;
  auVar488._0_8_ = uVar678;
  uVar642 = uVar651 + uVar659 * uVar667;
  uVar670 = uVar658 + uVar659 * uVar678;
  auVar174._8_8_ = 0;
  auVar174._0_8_ = uVar667;
  auVar489._8_8_ = 0;
  auVar489._0_8_ = local_a8;
  uVar663 = uVar642 >> 0x33 |
            (SUB168(auVar169 * auVar484,8) + SUB168(auVar161 * auVar476,8) +
             (ulong)CARRY8(uVar676 * uVar678,local_b8 * local_b8) + SUB168(auVar172 * auVar487,8) +
            (ulong)CARRY8(uVar651,uVar659 * uVar667)) * 0x2000;
  uVar651 = uStack_a0 * uVar679 + uVar667 * local_a8;
  uVar657 = uVar645 >> 0x33 |
            (SUB168(auVar163 * auVar478,8) + SUB168(auVar162 * auVar477,8) +
             (ulong)CARRY8(local_a8 * uVar679,uStack_b0 * uStack_b0) + SUB168(auVar168 * auVar483,8)
            + (ulong)CARRY8(uVar648,uVar664)) * 0x2000;
  uVar648 = uVar651 + uVar659 * local_98;
  uVar664 = uVar648 + uVar657;
  uVar669 = uVar670 + uVar663;
  auVar175._8_8_ = 0;
  auVar175._0_8_ = local_a8;
  auVar490._8_8_ = 0;
  auVar490._0_8_ = local_a8;
  uVar674 = uStack_a0 * uVar667 + local_a8 * local_a8;
  uVar672 = uVar674 + local_98 * uVar679;
  uVar651 = uVar664 >> 0x33 |
            (SUB168(auVar165 * auVar480,8) + SUB168(auVar174 * auVar489,8) +
             (ulong)CARRY8(uStack_a0 * uVar679,uVar667 * local_a8) + SUB168(auVar171 * auVar486,8) +
             (ulong)CARRY8(uVar651,uVar659 * local_98) + (ulong)CARRY8(uVar648,uVar657)) * 0x2000;
  uVar648 = uVar672 + uVar651;
  local_c0 = uVar648 & 0x7ffffffffffff;
  local_d0 = (uVar645 & 0x7ffffffffffff) +
             (uVar669 >> 0x33 |
             (SUB168(auVar167 * auVar482,8) + SUB168(auVar164 * auVar479,8) +
              (ulong)CARRY8(uVar676 * uStack_a0,uVar679 * uStack_b0) + SUB168(auVar173 * auVar488,8)
              + (ulong)CARRY8(uVar658,uVar659 * uVar678) + (ulong)CARRY8(uVar670,uVar663)) * 0x2000)
  ;
  local_e0 = (uVar642 & 0x7ffffffffffff) +
             (uVar648 >> 0x33 |
             (SUB168(auVar166 * auVar481,8) + SUB168(auVar175 * auVar490,8) +
              (ulong)CARRY8(uStack_a0 * uVar667,local_a8 * local_a8) + SUB168(auVar170 * auVar485,8)
              + (ulong)CARRY8(uVar674,local_98 * uVar679) + (ulong)CARRY8(uVar672,uVar651)) * 0x2000
             ) * 0x13;
  uStack_c8 = (uVar664 & 0x7ffffffffffff) + (local_d0 >> 0x33);
  local_d0 = local_d0 & 0x7ffffffffffff;
  uStack_d8 = (uVar669 & 0x7ffffffffffff) + (local_e0 >> 0x33);
  local_e0 = local_e0 & 0x7ffffffffffff;
  iVar641 = 9;
  do {
    uVar657 = local_c0 * 0x13;
    uVar670 = uStack_c8 * 2 * uVar657;
    auVar176._8_8_ = 0;
    auVar176._0_8_ = local_e0;
    auVar491._8_8_ = 0;
    auVar491._0_8_ = local_e0;
    uVar679 = local_e0 * 2;
    auVar177._8_8_ = 0;
    auVar177._0_8_ = uStack_d8;
    auVar492._8_8_ = 0;
    auVar492._0_8_ = uStack_d8;
    uVar648 = uStack_d8 * uStack_d8 + uVar670;
    auVar178._8_8_ = 0;
    auVar178._0_8_ = uStack_c8 * 2;
    auVar493._8_8_ = 0;
    auVar493._0_8_ = uVar657;
    uVar672 = uStack_d8 * 2;
    uVar667 = uStack_c8 * 0x13;
    uVar676 = local_d0 * 2;
    auVar179._8_8_ = 0;
    auVar179._0_8_ = uVar679;
    auVar494._8_8_ = 0;
    auVar494._0_8_ = local_d0;
    uVar658 = uVar648 + uVar679 * local_d0;
    auVar180._8_8_ = 0;
    auVar180._0_8_ = uVar679;
    auVar495._8_8_ = 0;
    auVar495._0_8_ = uStack_c8;
    auVar181._8_8_ = 0;
    auVar181._0_8_ = uVar672;
    auVar496._8_8_ = 0;
    auVar496._0_8_ = uStack_c8;
    auVar182._8_8_ = 0;
    auVar182._0_8_ = uVar667;
    auVar497._8_8_ = 0;
    auVar497._0_8_ = uStack_c8;
    auVar183._8_8_ = 0;
    auVar183._0_8_ = uVar676;
    auVar498._8_8_ = 0;
    auVar498._0_8_ = uVar667;
    uVar645 = local_e0 * local_e0 + uVar676 * uVar667;
    auVar184._8_8_ = 0;
    auVar184._0_8_ = uVar679;
    auVar499._8_8_ = 0;
    auVar499._0_8_ = uStack_d8;
    auVar185._8_8_ = 0;
    auVar185._0_8_ = uVar679;
    auVar500._8_8_ = 0;
    auVar500._0_8_ = local_c0;
    uVar663 = uVar679 * local_c0;
    auVar186._8_8_ = 0;
    auVar186._0_8_ = uVar657;
    auVar501._8_8_ = 0;
    auVar501._0_8_ = local_c0;
    auVar187._8_8_ = 0;
    auVar187._0_8_ = uVar672;
    auVar502._8_8_ = 0;
    auVar502._0_8_ = uVar657;
    auVar188._8_8_ = 0;
    auVar188._0_8_ = uVar676;
    auVar503._8_8_ = 0;
    auVar503._0_8_ = uVar657;
    uVar651 = uVar645 + uVar672 * uVar657;
    auVar189._8_8_ = 0;
    auVar189._0_8_ = uVar672;
    auVar504._8_8_ = 0;
    auVar504._0_8_ = local_d0;
    uVar642 = uVar672 * local_d0 + uVar657 * local_c0;
    uVar659 = uVar651 >> 0x33 |
              (SUB168(auVar176 * auVar491,8) + SUB168(auVar183 * auVar498,8) +
               (ulong)CARRY8(local_e0 * local_e0,uVar676 * uVar667) + SUB168(auVar187 * auVar502,8)
              + (ulong)CARRY8(uVar645,uVar672 * uVar657)) * 0x2000;
    uVar645 = uVar642 + uVar679 * uStack_c8;
    uVar664 = uVar658 >> 0x33 |
              (SUB168(auVar177 * auVar492,8) + SUB168(auVar178 * auVar493,8) +
               (ulong)CARRY8(uStack_d8 * uStack_d8,uVar670) + SUB168(auVar179 * auVar494,8) +
              (ulong)CARRY8(uVar648,uVar679 * local_d0)) * 0x2000;
    uVar648 = uVar645 + uVar664;
    uVar670 = uVar676 * uVar657 + uVar667 * uStack_c8;
    uVar678 = uVar648 >> 0x33 |
              (SUB168(auVar189 * auVar504,8) + SUB168(auVar186 * auVar501,8) +
               (ulong)CARRY8(uVar672 * local_d0,uVar657 * local_c0) + SUB168(auVar180 * auVar495,8)
               + (ulong)CARRY8(uVar642,uVar679 * uStack_c8) + (ulong)CARRY8(uVar645,uVar664)) *
              0x2000;
    uVar645 = uVar670 + uVar679 * uStack_d8;
    uVar642 = uVar645 + uVar659;
    auVar190._8_8_ = 0;
    auVar190._0_8_ = local_d0;
    auVar505._8_8_ = 0;
    auVar505._0_8_ = local_d0;
    uVar664 = uVar672 * uStack_c8 + local_d0 * local_d0;
    uVar669 = uVar664 + uVar663;
    uVar674 = uVar669 + uVar678;
    uVar658 = (uVar658 & 0x7ffffffffffff) +
              (uVar642 >> 0x33 |
              (SUB168(auVar188 * auVar503,8) + SUB168(auVar182 * auVar497,8) +
               (ulong)CARRY8(uVar676 * uVar657,uVar667 * uStack_c8) + SUB168(auVar184 * auVar499,8)
               + (ulong)CARRY8(uVar670,uVar679 * uStack_d8) + (ulong)CARRY8(uVar645,uVar659)) *
              0x2000);
    local_c0 = uVar674 & 0x7ffffffffffff;
    local_e0 = (uVar651 & 0x7ffffffffffff) +
               (uVar674 >> 0x33 |
               (SUB168(auVar181 * auVar496,8) + SUB168(auVar190 * auVar505,8) +
                (ulong)CARRY8(uVar672 * uStack_c8,local_d0 * local_d0) +
                SUB168(auVar185 * auVar500,8) + (ulong)CARRY8(uVar664,uVar663) +
               (ulong)CARRY8(uVar669,uVar678)) * 0x2000) * 0x13;
    uStack_c8 = (uVar648 & 0x7ffffffffffff) + (uVar658 >> 0x33);
    local_d0 = uVar658 & 0x7ffffffffffff;
    iVar641 = iVar641 + -1;
    uStack_d8 = (uVar642 & 0x7ffffffffffff) + (local_e0 >> 0x33);
    local_e0 = local_e0 & 0x7ffffffffffff;
  } while (iVar641 != 0);
  FUN_00a46a4c(&local_e0,&local_e0,&local_b8);
  auVar191._8_8_ = 0;
  auVar191._0_8_ = local_e0;
  auVar506._8_8_ = 0;
  auVar506._0_8_ = local_e0;
  uVar679 = local_e0 * 2;
  auVar192._8_8_ = 0;
  auVar192._0_8_ = uStack_d8;
  auVar507._8_8_ = 0;
  auVar507._0_8_ = uStack_d8;
  uVar676 = uStack_c8 * 0x13;
  auVar193._8_8_ = 0;
  auVar193._0_8_ = local_d0;
  auVar508._8_8_ = 0;
  auVar508._0_8_ = uVar679;
  uVar648 = local_d0 * uVar679 + uStack_d8 * uStack_d8;
  uVar667 = uStack_d8 * 2;
  auVar194._8_8_ = 0;
  auVar194._0_8_ = uVar679;
  auVar509._8_8_ = 0;
  auVar509._0_8_ = uStack_d8;
  uVar659 = local_c0 * 0x13;
  auVar195._8_8_ = 0;
  auVar195._0_8_ = uStack_c8;
  auVar510._8_8_ = 0;
  auVar510._0_8_ = uVar679;
  auVar196._8_8_ = 0;
  auVar196._0_8_ = uStack_c8;
  auVar511._8_8_ = 0;
  auVar511._0_8_ = uVar667;
  uVar658 = uVar676 * uStack_c8 + uVar679 * uStack_d8;
  auVar197._8_8_ = 0;
  auVar197._0_8_ = uVar676;
  auVar512._8_8_ = 0;
  auVar512._0_8_ = uStack_c8;
  auVar198._8_8_ = 0;
  auVar198._0_8_ = uVar659;
  auVar513._8_8_ = 0;
  auVar513._0_8_ = uStack_c8 * 2;
  uVar664 = uVar659 * uStack_c8 * 2;
  uVar678 = local_d0 * 2;
  uVar645 = uVar648 + uVar664;
  auVar199._8_8_ = 0;
  auVar199._0_8_ = uVar676;
  auVar514._8_8_ = 0;
  auVar514._0_8_ = uVar678;
  uVar651 = uVar676 * uVar678 + local_e0 * local_e0;
  auVar200._8_8_ = 0;
  auVar200._0_8_ = local_c0;
  auVar515._8_8_ = 0;
  auVar515._0_8_ = uVar679;
  auVar201._8_8_ = 0;
  auVar201._0_8_ = uVar659;
  auVar516._8_8_ = 0;
  auVar516._0_8_ = local_c0;
  auVar202._8_8_ = 0;
  auVar202._0_8_ = uVar659;
  auVar517._8_8_ = 0;
  auVar517._0_8_ = uVar667;
  auVar203._8_8_ = 0;
  auVar203._0_8_ = uVar659;
  auVar518._8_8_ = 0;
  auVar518._0_8_ = uVar678;
  uVar642 = uVar651 + uVar659 * uVar667;
  uVar670 = uVar658 + uVar659 * uVar678;
  auVar204._8_8_ = 0;
  auVar204._0_8_ = uVar667;
  auVar519._8_8_ = 0;
  auVar519._0_8_ = local_d0;
  uVar663 = uVar642 >> 0x33 |
            (SUB168(auVar199 * auVar514,8) + SUB168(auVar191 * auVar506,8) +
             (ulong)CARRY8(uVar676 * uVar678,local_e0 * local_e0) + SUB168(auVar202 * auVar517,8) +
            (ulong)CARRY8(uVar651,uVar659 * uVar667)) * 0x2000;
  uVar651 = uStack_c8 * uVar679 + uVar667 * local_d0;
  uVar657 = uVar645 >> 0x33 |
            (SUB168(auVar193 * auVar508,8) + SUB168(auVar192 * auVar507,8) +
             (ulong)CARRY8(local_d0 * uVar679,uStack_d8 * uStack_d8) + SUB168(auVar198 * auVar513,8)
            + (ulong)CARRY8(uVar648,uVar664)) * 0x2000;
  uVar648 = uVar651 + uVar659 * local_c0;
  uVar664 = uVar648 + uVar657;
  uVar669 = uVar670 + uVar663;
  auVar205._8_8_ = 0;
  auVar205._0_8_ = local_d0;
  auVar520._8_8_ = 0;
  auVar520._0_8_ = local_d0;
  uVar674 = uStack_c8 * uVar667 + local_d0 * local_d0;
  uVar672 = uVar674 + local_c0 * uVar679;
  uVar651 = uVar664 >> 0x33 |
            (SUB168(auVar195 * auVar510,8) + SUB168(auVar204 * auVar519,8) +
             (ulong)CARRY8(uStack_c8 * uVar679,uVar667 * local_d0) + SUB168(auVar201 * auVar516,8) +
             (ulong)CARRY8(uVar651,uVar659 * local_c0) + (ulong)CARRY8(uVar648,uVar657)) * 0x2000;
  uVar648 = uVar672 + uVar651;
  local_e8 = uVar648 & 0x7ffffffffffff;
  local_f8 = (uVar645 & 0x7ffffffffffff) +
             (uVar669 >> 0x33 |
             (SUB168(auVar197 * auVar512,8) + SUB168(auVar194 * auVar509,8) +
              (ulong)CARRY8(uVar676 * uStack_c8,uVar679 * uStack_d8) + SUB168(auVar203 * auVar518,8)
              + (ulong)CARRY8(uVar658,uVar659 * uVar678) + (ulong)CARRY8(uVar670,uVar663)) * 0x2000)
  ;
  local_108 = (uVar642 & 0x7ffffffffffff) +
              (uVar648 >> 0x33 |
              (SUB168(auVar196 * auVar511,8) + SUB168(auVar205 * auVar520,8) +
               (ulong)CARRY8(uStack_c8 * uVar667,local_d0 * local_d0) +
               SUB168(auVar200 * auVar515,8) + (ulong)CARRY8(uVar674,local_c0 * uVar679) +
              (ulong)CARRY8(uVar672,uVar651)) * 0x2000) * 0x13;
  uStack_f0 = (uVar664 & 0x7ffffffffffff) + (local_f8 >> 0x33);
  local_f8 = local_f8 & 0x7ffffffffffff;
  uStack_100 = (uVar669 & 0x7ffffffffffff) + (local_108 >> 0x33);
  local_108 = local_108 & 0x7ffffffffffff;
  iVar641 = 0x13;
  do {
    uVar657 = local_e8 * 0x13;
    uVar670 = uStack_f0 * 2 * uVar657;
    auVar206._8_8_ = 0;
    auVar206._0_8_ = local_108;
    auVar521._8_8_ = 0;
    auVar521._0_8_ = local_108;
    uVar679 = local_108 * 2;
    auVar207._8_8_ = 0;
    auVar207._0_8_ = uStack_100;
    auVar522._8_8_ = 0;
    auVar522._0_8_ = uStack_100;
    uVar648 = uStack_100 * uStack_100 + uVar670;
    auVar208._8_8_ = 0;
    auVar208._0_8_ = uStack_f0 * 2;
    auVar523._8_8_ = 0;
    auVar523._0_8_ = uVar657;
    uVar672 = uStack_100 * 2;
    uVar667 = uStack_f0 * 0x13;
    uVar676 = local_f8 * 2;
    auVar209._8_8_ = 0;
    auVar209._0_8_ = uVar679;
    auVar524._8_8_ = 0;
    auVar524._0_8_ = local_f8;
    uVar658 = uVar648 + uVar679 * local_f8;
    auVar210._8_8_ = 0;
    auVar210._0_8_ = uVar679;
    auVar525._8_8_ = 0;
    auVar525._0_8_ = uStack_f0;
    auVar211._8_8_ = 0;
    auVar211._0_8_ = uVar672;
    auVar526._8_8_ = 0;
    auVar526._0_8_ = uStack_f0;
    auVar212._8_8_ = 0;
    auVar212._0_8_ = uVar667;
    auVar527._8_8_ = 0;
    auVar527._0_8_ = uStack_f0;
    auVar213._8_8_ = 0;
    auVar213._0_8_ = uVar676;
    auVar528._8_8_ = 0;
    auVar528._0_8_ = uVar667;
    uVar645 = local_108 * local_108 + uVar676 * uVar667;
    auVar214._8_8_ = 0;
    auVar214._0_8_ = uVar679;
    auVar529._8_8_ = 0;
    auVar529._0_8_ = uStack_100;
    auVar215._8_8_ = 0;
    auVar215._0_8_ = uVar679;
    auVar530._8_8_ = 0;
    auVar530._0_8_ = local_e8;
    uVar663 = uVar679 * local_e8;
    auVar216._8_8_ = 0;
    auVar216._0_8_ = uVar657;
    auVar531._8_8_ = 0;
    auVar531._0_8_ = local_e8;
    auVar217._8_8_ = 0;
    auVar217._0_8_ = uVar672;
    auVar532._8_8_ = 0;
    auVar532._0_8_ = uVar657;
    auVar218._8_8_ = 0;
    auVar218._0_8_ = uVar676;
    auVar533._8_8_ = 0;
    auVar533._0_8_ = uVar657;
    uVar651 = uVar645 + uVar672 * uVar657;
    auVar219._8_8_ = 0;
    auVar219._0_8_ = uVar672;
    auVar534._8_8_ = 0;
    auVar534._0_8_ = local_f8;
    uVar642 = uVar672 * local_f8 + uVar657 * local_e8;
    uVar659 = uVar651 >> 0x33 |
              (SUB168(auVar206 * auVar521,8) + SUB168(auVar213 * auVar528,8) +
               (ulong)CARRY8(local_108 * local_108,uVar676 * uVar667) +
               SUB168(auVar217 * auVar532,8) + (ulong)CARRY8(uVar645,uVar672 * uVar657)) * 0x2000;
    uVar645 = uVar642 + uVar679 * uStack_f0;
    uVar664 = uVar658 >> 0x33 |
              (SUB168(auVar207 * auVar522,8) + SUB168(auVar208 * auVar523,8) +
               (ulong)CARRY8(uStack_100 * uStack_100,uVar670) + SUB168(auVar209 * auVar524,8) +
              (ulong)CARRY8(uVar648,uVar679 * local_f8)) * 0x2000;
    uVar648 = uVar645 + uVar664;
    uVar670 = uVar676 * uVar657 + uVar667 * uStack_f0;
    uVar678 = uVar648 >> 0x33 |
              (SUB168(auVar219 * auVar534,8) + SUB168(auVar216 * auVar531,8) +
               (ulong)CARRY8(uVar672 * local_f8,uVar657 * local_e8) + SUB168(auVar210 * auVar525,8)
               + (ulong)CARRY8(uVar642,uVar679 * uStack_f0) + (ulong)CARRY8(uVar645,uVar664)) *
              0x2000;
    uVar645 = uVar670 + uVar679 * uStack_100;
    uVar642 = uVar645 + uVar659;
    auVar220._8_8_ = 0;
    auVar220._0_8_ = local_f8;
    auVar535._8_8_ = 0;
    auVar535._0_8_ = local_f8;
    uVar664 = uVar672 * uStack_f0 + local_f8 * local_f8;
    uVar669 = uVar664 + uVar663;
    uVar674 = uVar669 + uVar678;
    uVar658 = (uVar658 & 0x7ffffffffffff) +
              (uVar642 >> 0x33 |
              (SUB168(auVar218 * auVar533,8) + SUB168(auVar212 * auVar527,8) +
               (ulong)CARRY8(uVar676 * uVar657,uVar667 * uStack_f0) + SUB168(auVar214 * auVar529,8)
               + (ulong)CARRY8(uVar670,uVar679 * uStack_100) + (ulong)CARRY8(uVar645,uVar659)) *
              0x2000);
    local_e8 = uVar674 & 0x7ffffffffffff;
    local_108 = (uVar651 & 0x7ffffffffffff) +
                (uVar674 >> 0x33 |
                (SUB168(auVar211 * auVar526,8) + SUB168(auVar220 * auVar535,8) +
                 (ulong)CARRY8(uVar672 * uStack_f0,local_f8 * local_f8) +
                 SUB168(auVar215 * auVar530,8) + (ulong)CARRY8(uVar664,uVar663) +
                (ulong)CARRY8(uVar669,uVar678)) * 0x2000) * 0x13;
    uStack_f0 = (uVar648 & 0x7ffffffffffff) + (uVar658 >> 0x33);
    local_f8 = uVar658 & 0x7ffffffffffff;
    iVar641 = iVar641 + -1;
    uStack_100 = (uVar642 & 0x7ffffffffffff) + (local_108 >> 0x33);
    local_108 = local_108 & 0x7ffffffffffff;
  } while (iVar641 != 0);
  FUN_00a46a4c(&local_e0,&local_108,&local_e0);
  iVar641 = 10;
  do {
    uVar657 = local_c0 * 0x13;
    uVar670 = uStack_c8 * 2 * uVar657;
    auVar221._8_8_ = 0;
    auVar221._0_8_ = local_e0;
    auVar536._8_8_ = 0;
    auVar536._0_8_ = local_e0;
    uVar679 = local_e0 * 2;
    auVar222._8_8_ = 0;
    auVar222._0_8_ = uStack_d8;
    auVar537._8_8_ = 0;
    auVar537._0_8_ = uStack_d8;
    uVar648 = uStack_d8 * uStack_d8 + uVar670;
    auVar223._8_8_ = 0;
    auVar223._0_8_ = uStack_c8 * 2;
    auVar538._8_8_ = 0;
    auVar538._0_8_ = uVar657;
    uVar672 = uStack_d8 * 2;
    uVar667 = uStack_c8 * 0x13;
    uVar676 = local_d0 * 2;
    auVar224._8_8_ = 0;
    auVar224._0_8_ = uVar679;
    auVar539._8_8_ = 0;
    auVar539._0_8_ = local_d0;
    uVar658 = uVar648 + uVar679 * local_d0;
    auVar225._8_8_ = 0;
    auVar225._0_8_ = uVar679;
    auVar540._8_8_ = 0;
    auVar540._0_8_ = uStack_c8;
    auVar226._8_8_ = 0;
    auVar226._0_8_ = uVar672;
    auVar541._8_8_ = 0;
    auVar541._0_8_ = uStack_c8;
    auVar227._8_8_ = 0;
    auVar227._0_8_ = uVar667;
    auVar542._8_8_ = 0;
    auVar542._0_8_ = uStack_c8;
    auVar228._8_8_ = 0;
    auVar228._0_8_ = uVar676;
    auVar543._8_8_ = 0;
    auVar543._0_8_ = uVar667;
    uVar645 = local_e0 * local_e0 + uVar676 * uVar667;
    auVar229._8_8_ = 0;
    auVar229._0_8_ = uVar679;
    auVar544._8_8_ = 0;
    auVar544._0_8_ = uStack_d8;
    auVar230._8_8_ = 0;
    auVar230._0_8_ = uVar679;
    auVar545._8_8_ = 0;
    auVar545._0_8_ = local_c0;
    uVar663 = uVar679 * local_c0;
    auVar231._8_8_ = 0;
    auVar231._0_8_ = uVar657;
    auVar546._8_8_ = 0;
    auVar546._0_8_ = local_c0;
    auVar232._8_8_ = 0;
    auVar232._0_8_ = uVar672;
    auVar547._8_8_ = 0;
    auVar547._0_8_ = uVar657;
    auVar233._8_8_ = 0;
    auVar233._0_8_ = uVar676;
    auVar548._8_8_ = 0;
    auVar548._0_8_ = uVar657;
    uVar651 = uVar645 + uVar672 * uVar657;
    auVar234._8_8_ = 0;
    auVar234._0_8_ = uVar672;
    auVar549._8_8_ = 0;
    auVar549._0_8_ = local_d0;
    uVar642 = uVar672 * local_d0 + uVar657 * local_c0;
    uVar659 = uVar651 >> 0x33 |
              (SUB168(auVar221 * auVar536,8) + SUB168(auVar228 * auVar543,8) +
               (ulong)CARRY8(local_e0 * local_e0,uVar676 * uVar667) + SUB168(auVar232 * auVar547,8)
              + (ulong)CARRY8(uVar645,uVar672 * uVar657)) * 0x2000;
    uVar645 = uVar642 + uVar679 * uStack_c8;
    uVar664 = uVar658 >> 0x33 |
              (SUB168(auVar222 * auVar537,8) + SUB168(auVar223 * auVar538,8) +
               (ulong)CARRY8(uStack_d8 * uStack_d8,uVar670) + SUB168(auVar224 * auVar539,8) +
              (ulong)CARRY8(uVar648,uVar679 * local_d0)) * 0x2000;
    uVar648 = uVar645 + uVar664;
    uVar670 = uVar676 * uVar657 + uVar667 * uStack_c8;
    uVar678 = uVar648 >> 0x33 |
              (SUB168(auVar234 * auVar549,8) + SUB168(auVar231 * auVar546,8) +
               (ulong)CARRY8(uVar672 * local_d0,uVar657 * local_c0) + SUB168(auVar225 * auVar540,8)
               + (ulong)CARRY8(uVar642,uVar679 * uStack_c8) + (ulong)CARRY8(uVar645,uVar664)) *
              0x2000;
    uVar645 = uVar670 + uVar679 * uStack_d8;
    uVar642 = uVar645 + uVar659;
    auVar235._8_8_ = 0;
    auVar235._0_8_ = local_d0;
    auVar550._8_8_ = 0;
    auVar550._0_8_ = local_d0;
    uVar664 = uVar672 * uStack_c8 + local_d0 * local_d0;
    uVar669 = uVar664 + uVar663;
    uVar674 = uVar669 + uVar678;
    uVar658 = (uVar658 & 0x7ffffffffffff) +
              (uVar642 >> 0x33 |
              (SUB168(auVar233 * auVar548,8) + SUB168(auVar227 * auVar542,8) +
               (ulong)CARRY8(uVar676 * uVar657,uVar667 * uStack_c8) + SUB168(auVar229 * auVar544,8)
               + (ulong)CARRY8(uVar670,uVar679 * uStack_d8) + (ulong)CARRY8(uVar645,uVar659)) *
              0x2000);
    local_c0 = uVar674 & 0x7ffffffffffff;
    local_e0 = (uVar651 & 0x7ffffffffffff) +
               (uVar674 >> 0x33 |
               (SUB168(auVar226 * auVar541,8) + SUB168(auVar235 * auVar550,8) +
                (ulong)CARRY8(uVar672 * uStack_c8,local_d0 * local_d0) +
                SUB168(auVar230 * auVar545,8) + (ulong)CARRY8(uVar664,uVar663) +
               (ulong)CARRY8(uVar669,uVar678)) * 0x2000) * 0x13;
    uStack_c8 = (uVar648 & 0x7ffffffffffff) + (uVar658 >> 0x33);
    local_d0 = uVar658 & 0x7ffffffffffff;
    iVar641 = iVar641 + -1;
    uStack_d8 = (uVar642 & 0x7ffffffffffff) + (local_e0 >> 0x33);
    local_e0 = local_e0 & 0x7ffffffffffff;
  } while (iVar641 != 0);
  FUN_00a46a4c(&local_b8,&local_e0,&local_b8);
  auVar236._8_8_ = 0;
  auVar236._0_8_ = local_b8;
  auVar551._8_8_ = 0;
  auVar551._0_8_ = local_b8;
  uVar679 = local_b8 * 2;
  auVar237._8_8_ = 0;
  auVar237._0_8_ = uStack_b0;
  auVar552._8_8_ = 0;
  auVar552._0_8_ = uStack_b0;
  uVar676 = uStack_a0 * 0x13;
  auVar238._8_8_ = 0;
  auVar238._0_8_ = local_a8;
  auVar553._8_8_ = 0;
  auVar553._0_8_ = uVar679;
  uVar648 = local_a8 * uVar679 + uStack_b0 * uStack_b0;
  uVar667 = uStack_b0 * 2;
  auVar239._8_8_ = 0;
  auVar239._0_8_ = uVar679;
  auVar554._8_8_ = 0;
  auVar554._0_8_ = uStack_b0;
  uVar659 = local_98 * 0x13;
  auVar240._8_8_ = 0;
  auVar240._0_8_ = uStack_a0;
  auVar555._8_8_ = 0;
  auVar555._0_8_ = uVar679;
  auVar241._8_8_ = 0;
  auVar241._0_8_ = uStack_a0;
  auVar556._8_8_ = 0;
  auVar556._0_8_ = uVar667;
  uVar658 = uVar676 * uStack_a0 + uVar679 * uStack_b0;
  auVar242._8_8_ = 0;
  auVar242._0_8_ = uVar676;
  auVar557._8_8_ = 0;
  auVar557._0_8_ = uStack_a0;
  auVar243._8_8_ = 0;
  auVar243._0_8_ = uVar659;
  auVar558._8_8_ = 0;
  auVar558._0_8_ = uStack_a0 * 2;
  uVar664 = uVar659 * uStack_a0 * 2;
  uVar678 = local_a8 * 2;
  uVar645 = uVar648 + uVar664;
  auVar244._8_8_ = 0;
  auVar244._0_8_ = uVar676;
  auVar559._8_8_ = 0;
  auVar559._0_8_ = uVar678;
  uVar651 = uVar676 * uVar678 + local_b8 * local_b8;
  auVar245._8_8_ = 0;
  auVar245._0_8_ = local_98;
  auVar560._8_8_ = 0;
  auVar560._0_8_ = uVar679;
  auVar246._8_8_ = 0;
  auVar246._0_8_ = uVar659;
  auVar561._8_8_ = 0;
  auVar561._0_8_ = local_98;
  auVar247._8_8_ = 0;
  auVar247._0_8_ = uVar659;
  auVar562._8_8_ = 0;
  auVar562._0_8_ = uVar667;
  auVar248._8_8_ = 0;
  auVar248._0_8_ = uVar659;
  auVar563._8_8_ = 0;
  auVar563._0_8_ = uVar678;
  uVar642 = uVar651 + uVar659 * uVar667;
  uVar670 = uVar658 + uVar659 * uVar678;
  auVar249._8_8_ = 0;
  auVar249._0_8_ = uVar667;
  auVar564._8_8_ = 0;
  auVar564._0_8_ = local_a8;
  uVar663 = uVar642 >> 0x33 |
            (SUB168(auVar244 * auVar559,8) + SUB168(auVar236 * auVar551,8) +
             (ulong)CARRY8(uVar676 * uVar678,local_b8 * local_b8) + SUB168(auVar247 * auVar562,8) +
            (ulong)CARRY8(uVar651,uVar659 * uVar667)) * 0x2000;
  uVar651 = uStack_a0 * uVar679 + uVar667 * local_a8;
  uVar657 = uVar645 >> 0x33 |
            (SUB168(auVar238 * auVar553,8) + SUB168(auVar237 * auVar552,8) +
             (ulong)CARRY8(local_a8 * uVar679,uStack_b0 * uStack_b0) + SUB168(auVar243 * auVar558,8)
            + (ulong)CARRY8(uVar648,uVar664)) * 0x2000;
  uVar648 = uVar651 + uVar659 * local_98;
  uVar664 = uVar648 + uVar657;
  uVar669 = uVar670 + uVar663;
  auVar250._8_8_ = 0;
  auVar250._0_8_ = local_a8;
  auVar565._8_8_ = 0;
  auVar565._0_8_ = local_a8;
  uVar674 = uStack_a0 * uVar667 + local_a8 * local_a8;
  uVar672 = uVar674 + local_98 * uVar679;
  uVar651 = uVar664 >> 0x33 |
            (SUB168(auVar240 * auVar555,8) + SUB168(auVar249 * auVar564,8) +
             (ulong)CARRY8(uStack_a0 * uVar679,uVar667 * local_a8) + SUB168(auVar246 * auVar561,8) +
             (ulong)CARRY8(uVar651,uVar659 * local_98) + (ulong)CARRY8(uVar648,uVar657)) * 0x2000;
  uVar648 = uVar672 + uVar651;
  local_c0 = uVar648 & 0x7ffffffffffff;
  local_d0 = (uVar645 & 0x7ffffffffffff) +
             (uVar669 >> 0x33 |
             (SUB168(auVar242 * auVar557,8) + SUB168(auVar239 * auVar554,8) +
              (ulong)CARRY8(uVar676 * uStack_a0,uVar679 * uStack_b0) + SUB168(auVar248 * auVar563,8)
              + (ulong)CARRY8(uVar658,uVar659 * uVar678) + (ulong)CARRY8(uVar670,uVar663)) * 0x2000)
  ;
  local_e0 = (uVar642 & 0x7ffffffffffff) +
             (uVar648 >> 0x33 |
             (SUB168(auVar241 * auVar556,8) + SUB168(auVar250 * auVar565,8) +
              (ulong)CARRY8(uStack_a0 * uVar667,local_a8 * local_a8) + SUB168(auVar245 * auVar560,8)
              + (ulong)CARRY8(uVar674,local_98 * uVar679) + (ulong)CARRY8(uVar672,uVar651)) * 0x2000
             ) * 0x13;
  uStack_c8 = (uVar664 & 0x7ffffffffffff) + (local_d0 >> 0x33);
  local_d0 = local_d0 & 0x7ffffffffffff;
  uStack_d8 = (uVar669 & 0x7ffffffffffff) + (local_e0 >> 0x33);
  local_e0 = local_e0 & 0x7ffffffffffff;
  iVar641 = 0x31;
  do {
    uVar657 = local_c0 * 0x13;
    uVar670 = uStack_c8 * 2 * uVar657;
    auVar251._8_8_ = 0;
    auVar251._0_8_ = local_e0;
    auVar566._8_8_ = 0;
    auVar566._0_8_ = local_e0;
    uVar679 = local_e0 * 2;
    auVar252._8_8_ = 0;
    auVar252._0_8_ = uStack_d8;
    auVar567._8_8_ = 0;
    auVar567._0_8_ = uStack_d8;
    uVar648 = uStack_d8 * uStack_d8 + uVar670;
    auVar253._8_8_ = 0;
    auVar253._0_8_ = uStack_c8 * 2;
    auVar568._8_8_ = 0;
    auVar568._0_8_ = uVar657;
    uVar672 = uStack_d8 * 2;
    uVar667 = uStack_c8 * 0x13;
    uVar676 = local_d0 * 2;
    auVar254._8_8_ = 0;
    auVar254._0_8_ = uVar679;
    auVar569._8_8_ = 0;
    auVar569._0_8_ = local_d0;
    uVar658 = uVar648 + uVar679 * local_d0;
    auVar255._8_8_ = 0;
    auVar255._0_8_ = uVar679;
    auVar570._8_8_ = 0;
    auVar570._0_8_ = uStack_c8;
    auVar256._8_8_ = 0;
    auVar256._0_8_ = uVar672;
    auVar571._8_8_ = 0;
    auVar571._0_8_ = uStack_c8;
    auVar257._8_8_ = 0;
    auVar257._0_8_ = uVar667;
    auVar572._8_8_ = 0;
    auVar572._0_8_ = uStack_c8;
    auVar258._8_8_ = 0;
    auVar258._0_8_ = uVar676;
    auVar573._8_8_ = 0;
    auVar573._0_8_ = uVar667;
    uVar645 = local_e0 * local_e0 + uVar676 * uVar667;
    auVar259._8_8_ = 0;
    auVar259._0_8_ = uVar679;
    auVar574._8_8_ = 0;
    auVar574._0_8_ = uStack_d8;
    auVar260._8_8_ = 0;
    auVar260._0_8_ = uVar679;
    auVar575._8_8_ = 0;
    auVar575._0_8_ = local_c0;
    uVar663 = uVar679 * local_c0;
    auVar261._8_8_ = 0;
    auVar261._0_8_ = uVar657;
    auVar576._8_8_ = 0;
    auVar576._0_8_ = local_c0;
    auVar262._8_8_ = 0;
    auVar262._0_8_ = uVar672;
    auVar577._8_8_ = 0;
    auVar577._0_8_ = uVar657;
    auVar263._8_8_ = 0;
    auVar263._0_8_ = uVar676;
    auVar578._8_8_ = 0;
    auVar578._0_8_ = uVar657;
    uVar651 = uVar645 + uVar672 * uVar657;
    auVar264._8_8_ = 0;
    auVar264._0_8_ = uVar672;
    auVar579._8_8_ = 0;
    auVar579._0_8_ = local_d0;
    uVar642 = uVar672 * local_d0 + uVar657 * local_c0;
    uVar659 = uVar651 >> 0x33 |
              (SUB168(auVar251 * auVar566,8) + SUB168(auVar258 * auVar573,8) +
               (ulong)CARRY8(local_e0 * local_e0,uVar676 * uVar667) + SUB168(auVar262 * auVar577,8)
              + (ulong)CARRY8(uVar645,uVar672 * uVar657)) * 0x2000;
    uVar645 = uVar642 + uVar679 * uStack_c8;
    uVar664 = uVar658 >> 0x33 |
              (SUB168(auVar252 * auVar567,8) + SUB168(auVar253 * auVar568,8) +
               (ulong)CARRY8(uStack_d8 * uStack_d8,uVar670) + SUB168(auVar254 * auVar569,8) +
              (ulong)CARRY8(uVar648,uVar679 * local_d0)) * 0x2000;
    uVar648 = uVar645 + uVar664;
    uVar670 = uVar676 * uVar657 + uVar667 * uStack_c8;
    uVar678 = uVar648 >> 0x33 |
              (SUB168(auVar264 * auVar579,8) + SUB168(auVar261 * auVar576,8) +
               (ulong)CARRY8(uVar672 * local_d0,uVar657 * local_c0) + SUB168(auVar255 * auVar570,8)
               + (ulong)CARRY8(uVar642,uVar679 * uStack_c8) + (ulong)CARRY8(uVar645,uVar664)) *
              0x2000;
    uVar645 = uVar670 + uVar679 * uStack_d8;
    uVar642 = uVar645 + uVar659;
    auVar265._8_8_ = 0;
    auVar265._0_8_ = local_d0;
    auVar580._8_8_ = 0;
    auVar580._0_8_ = local_d0;
    uVar664 = uVar672 * uStack_c8 + local_d0 * local_d0;
    uVar669 = uVar664 + uVar663;
    uVar674 = uVar669 + uVar678;
    uVar658 = (uVar658 & 0x7ffffffffffff) +
              (uVar642 >> 0x33 |
              (SUB168(auVar263 * auVar578,8) + SUB168(auVar257 * auVar572,8) +
               (ulong)CARRY8(uVar676 * uVar657,uVar667 * uStack_c8) + SUB168(auVar259 * auVar574,8)
               + (ulong)CARRY8(uVar670,uVar679 * uStack_d8) + (ulong)CARRY8(uVar645,uVar659)) *
              0x2000);
    local_c0 = uVar674 & 0x7ffffffffffff;
    local_e0 = (uVar651 & 0x7ffffffffffff) +
               (uVar674 >> 0x33 |
               (SUB168(auVar256 * auVar571,8) + SUB168(auVar265 * auVar580,8) +
                (ulong)CARRY8(uVar672 * uStack_c8,local_d0 * local_d0) +
                SUB168(auVar260 * auVar575,8) + (ulong)CARRY8(uVar664,uVar663) +
               (ulong)CARRY8(uVar669,uVar678)) * 0x2000) * 0x13;
    uStack_c8 = (uVar648 & 0x7ffffffffffff) + (uVar658 >> 0x33);
    local_d0 = uVar658 & 0x7ffffffffffff;
    iVar641 = iVar641 + -1;
    uStack_d8 = (uVar642 & 0x7ffffffffffff) + (local_e0 >> 0x33);
    local_e0 = local_e0 & 0x7ffffffffffff;
  } while (iVar641 != 0);
  FUN_00a46a4c(&local_e0,&local_e0,&local_b8);
  auVar266._8_8_ = 0;
  auVar266._0_8_ = local_e0;
  auVar581._8_8_ = 0;
  auVar581._0_8_ = local_e0;
  uVar679 = local_e0 * 2;
  auVar267._8_8_ = 0;
  auVar267._0_8_ = uStack_d8;
  auVar582._8_8_ = 0;
  auVar582._0_8_ = uStack_d8;
  uVar676 = uStack_c8 * 0x13;
  auVar268._8_8_ = 0;
  auVar268._0_8_ = local_d0;
  auVar583._8_8_ = 0;
  auVar583._0_8_ = uVar679;
  uVar648 = local_d0 * uVar679 + uStack_d8 * uStack_d8;
  uVar667 = uStack_d8 * 2;
  auVar269._8_8_ = 0;
  auVar269._0_8_ = uVar679;
  auVar584._8_8_ = 0;
  auVar584._0_8_ = uStack_d8;
  uVar659 = local_c0 * 0x13;
  auVar270._8_8_ = 0;
  auVar270._0_8_ = uStack_c8;
  auVar585._8_8_ = 0;
  auVar585._0_8_ = uVar679;
  auVar271._8_8_ = 0;
  auVar271._0_8_ = uStack_c8;
  auVar586._8_8_ = 0;
  auVar586._0_8_ = uVar667;
  uVar658 = uVar676 * uStack_c8 + uVar679 * uStack_d8;
  auVar272._8_8_ = 0;
  auVar272._0_8_ = uVar676;
  auVar587._8_8_ = 0;
  auVar587._0_8_ = uStack_c8;
  auVar273._8_8_ = 0;
  auVar273._0_8_ = uVar659;
  auVar588._8_8_ = 0;
  auVar588._0_8_ = uStack_c8 * 2;
  uVar664 = uVar659 * uStack_c8 * 2;
  uVar678 = local_d0 * 2;
  uVar645 = uVar648 + uVar664;
  auVar274._8_8_ = 0;
  auVar274._0_8_ = uVar676;
  auVar589._8_8_ = 0;
  auVar589._0_8_ = uVar678;
  uVar651 = uVar676 * uVar678 + local_e0 * local_e0;
  auVar275._8_8_ = 0;
  auVar275._0_8_ = local_c0;
  auVar590._8_8_ = 0;
  auVar590._0_8_ = uVar679;
  auVar276._8_8_ = 0;
  auVar276._0_8_ = uVar659;
  auVar591._8_8_ = 0;
  auVar591._0_8_ = local_c0;
  auVar277._8_8_ = 0;
  auVar277._0_8_ = uVar659;
  auVar592._8_8_ = 0;
  auVar592._0_8_ = uVar667;
  auVar278._8_8_ = 0;
  auVar278._0_8_ = uVar659;
  auVar593._8_8_ = 0;
  auVar593._0_8_ = uVar678;
  uVar642 = uVar651 + uVar659 * uVar667;
  uVar670 = uVar658 + uVar659 * uVar678;
  auVar279._8_8_ = 0;
  auVar279._0_8_ = uVar667;
  auVar594._8_8_ = 0;
  auVar594._0_8_ = local_d0;
  uVar663 = uVar642 >> 0x33 |
            (SUB168(auVar274 * auVar589,8) + SUB168(auVar266 * auVar581,8) +
             (ulong)CARRY8(uVar676 * uVar678,local_e0 * local_e0) + SUB168(auVar277 * auVar592,8) +
            (ulong)CARRY8(uVar651,uVar659 * uVar667)) * 0x2000;
  uVar651 = uStack_c8 * uVar679 + uVar667 * local_d0;
  uVar657 = uVar645 >> 0x33 |
            (SUB168(auVar268 * auVar583,8) + SUB168(auVar267 * auVar582,8) +
             (ulong)CARRY8(local_d0 * uVar679,uStack_d8 * uStack_d8) + SUB168(auVar273 * auVar588,8)
            + (ulong)CARRY8(uVar648,uVar664)) * 0x2000;
  uVar648 = uVar651 + uVar659 * local_c0;
  uVar664 = uVar648 + uVar657;
  uVar669 = uVar670 + uVar663;
  auVar280._8_8_ = 0;
  auVar280._0_8_ = local_d0;
  auVar595._8_8_ = 0;
  auVar595._0_8_ = local_d0;
  uVar674 = uStack_c8 * uVar667 + local_d0 * local_d0;
  uVar672 = uVar674 + local_c0 * uVar679;
  uVar651 = uVar664 >> 0x33 |
            (SUB168(auVar270 * auVar585,8) + SUB168(auVar279 * auVar594,8) +
             (ulong)CARRY8(uStack_c8 * uVar679,uVar667 * local_d0) + SUB168(auVar276 * auVar591,8) +
             (ulong)CARRY8(uVar651,uVar659 * local_c0) + (ulong)CARRY8(uVar648,uVar657)) * 0x2000;
  uVar648 = uVar672 + uVar651;
  local_e8 = uVar648 & 0x7ffffffffffff;
  local_f8 = (uVar645 & 0x7ffffffffffff) +
             (uVar669 >> 0x33 |
             (SUB168(auVar272 * auVar587,8) + SUB168(auVar269 * auVar584,8) +
              (ulong)CARRY8(uVar676 * uStack_c8,uVar679 * uStack_d8) + SUB168(auVar278 * auVar593,8)
              + (ulong)CARRY8(uVar658,uVar659 * uVar678) + (ulong)CARRY8(uVar670,uVar663)) * 0x2000)
  ;
  local_108 = (uVar642 & 0x7ffffffffffff) +
              (uVar648 >> 0x33 |
              (SUB168(auVar271 * auVar586,8) + SUB168(auVar280 * auVar595,8) +
               (ulong)CARRY8(uStack_c8 * uVar667,local_d0 * local_d0) +
               SUB168(auVar275 * auVar590,8) + (ulong)CARRY8(uVar674,local_c0 * uVar679) +
              (ulong)CARRY8(uVar672,uVar651)) * 0x2000) * 0x13;
  uStack_f0 = (uVar664 & 0x7ffffffffffff) + (local_f8 >> 0x33);
  local_f8 = local_f8 & 0x7ffffffffffff;
  uStack_100 = (uVar669 & 0x7ffffffffffff) + (local_108 >> 0x33);
  local_108 = local_108 & 0x7ffffffffffff;
  iVar641 = 99;
  do {
    uVar657 = local_e8 * 0x13;
    uVar670 = uStack_f0 * 2 * uVar657;
    auVar281._8_8_ = 0;
    auVar281._0_8_ = local_108;
    auVar596._8_8_ = 0;
    auVar596._0_8_ = local_108;
    uVar679 = local_108 * 2;
    auVar282._8_8_ = 0;
    auVar282._0_8_ = uStack_100;
    auVar597._8_8_ = 0;
    auVar597._0_8_ = uStack_100;
    uVar648 = uStack_100 * uStack_100 + uVar670;
    auVar283._8_8_ = 0;
    auVar283._0_8_ = uStack_f0 * 2;
    auVar598._8_8_ = 0;
    auVar598._0_8_ = uVar657;
    uVar672 = uStack_100 * 2;
    uVar667 = uStack_f0 * 0x13;
    uVar676 = local_f8 * 2;
    auVar284._8_8_ = 0;
    auVar284._0_8_ = uVar679;
    auVar599._8_8_ = 0;
    auVar599._0_8_ = local_f8;
    uVar658 = uVar648 + uVar679 * local_f8;
    auVar285._8_8_ = 0;
    auVar285._0_8_ = uVar679;
    auVar600._8_8_ = 0;
    auVar600._0_8_ = uStack_f0;
    auVar286._8_8_ = 0;
    auVar286._0_8_ = uVar672;
    auVar601._8_8_ = 0;
    auVar601._0_8_ = uStack_f0;
    auVar287._8_8_ = 0;
    auVar287._0_8_ = uVar667;
    auVar602._8_8_ = 0;
    auVar602._0_8_ = uStack_f0;
    auVar288._8_8_ = 0;
    auVar288._0_8_ = uVar676;
    auVar603._8_8_ = 0;
    auVar603._0_8_ = uVar667;
    uVar645 = local_108 * local_108 + uVar676 * uVar667;
    auVar289._8_8_ = 0;
    auVar289._0_8_ = uVar679;
    auVar604._8_8_ = 0;
    auVar604._0_8_ = uStack_100;
    auVar290._8_8_ = 0;
    auVar290._0_8_ = uVar679;
    auVar605._8_8_ = 0;
    auVar605._0_8_ = local_e8;
    uVar663 = uVar679 * local_e8;
    auVar291._8_8_ = 0;
    auVar291._0_8_ = uVar657;
    auVar606._8_8_ = 0;
    auVar606._0_8_ = local_e8;
    auVar292._8_8_ = 0;
    auVar292._0_8_ = uVar672;
    auVar607._8_8_ = 0;
    auVar607._0_8_ = uVar657;
    auVar293._8_8_ = 0;
    auVar293._0_8_ = uVar676;
    auVar608._8_8_ = 0;
    auVar608._0_8_ = uVar657;
    uVar651 = uVar645 + uVar672 * uVar657;
    auVar294._8_8_ = 0;
    auVar294._0_8_ = uVar672;
    auVar609._8_8_ = 0;
    auVar609._0_8_ = local_f8;
    uVar642 = uVar672 * local_f8 + uVar657 * local_e8;
    uVar659 = uVar651 >> 0x33 |
              (SUB168(auVar281 * auVar596,8) + SUB168(auVar288 * auVar603,8) +
               (ulong)CARRY8(local_108 * local_108,uVar676 * uVar667) +
               SUB168(auVar292 * auVar607,8) + (ulong)CARRY8(uVar645,uVar672 * uVar657)) * 0x2000;
    uVar645 = uVar642 + uVar679 * uStack_f0;
    uVar664 = uVar658 >> 0x33 |
              (SUB168(auVar282 * auVar597,8) + SUB168(auVar283 * auVar598,8) +
               (ulong)CARRY8(uStack_100 * uStack_100,uVar670) + SUB168(auVar284 * auVar599,8) +
              (ulong)CARRY8(uVar648,uVar679 * local_f8)) * 0x2000;
    uVar648 = uVar645 + uVar664;
    uVar670 = uVar676 * uVar657 + uVar667 * uStack_f0;
    uVar678 = uVar648 >> 0x33 |
              (SUB168(auVar294 * auVar609,8) + SUB168(auVar291 * auVar606,8) +
               (ulong)CARRY8(uVar672 * local_f8,uVar657 * local_e8) + SUB168(auVar285 * auVar600,8)
               + (ulong)CARRY8(uVar642,uVar679 * uStack_f0) + (ulong)CARRY8(uVar645,uVar664)) *
              0x2000;
    uVar645 = uVar670 + uVar679 * uStack_100;
    uVar642 = uVar645 + uVar659;
    auVar295._8_8_ = 0;
    auVar295._0_8_ = local_f8;
    auVar610._8_8_ = 0;
    auVar610._0_8_ = local_f8;
    uVar664 = uVar672 * uStack_f0 + local_f8 * local_f8;
    uVar669 = uVar664 + uVar663;
    uVar674 = uVar669 + uVar678;
    uVar658 = (uVar658 & 0x7ffffffffffff) +
              (uVar642 >> 0x33 |
              (SUB168(auVar293 * auVar608,8) + SUB168(auVar287 * auVar602,8) +
               (ulong)CARRY8(uVar676 * uVar657,uVar667 * uStack_f0) + SUB168(auVar289 * auVar604,8)
               + (ulong)CARRY8(uVar670,uVar679 * uStack_100) + (ulong)CARRY8(uVar645,uVar659)) *
              0x2000);
    local_e8 = uVar674 & 0x7ffffffffffff;
    local_108 = (uVar651 & 0x7ffffffffffff) +
                (uVar674 >> 0x33 |
                (SUB168(auVar286 * auVar601,8) + SUB168(auVar295 * auVar610,8) +
                 (ulong)CARRY8(uVar672 * uStack_f0,local_f8 * local_f8) +
                 SUB168(auVar290 * auVar605,8) + (ulong)CARRY8(uVar664,uVar663) +
                (ulong)CARRY8(uVar669,uVar678)) * 0x2000) * 0x13;
    uStack_f0 = (uVar648 & 0x7ffffffffffff) + (uVar658 >> 0x33);
    local_f8 = uVar658 & 0x7ffffffffffff;
    iVar641 = iVar641 + -1;
    uStack_100 = (uVar642 & 0x7ffffffffffff) + (local_108 >> 0x33);
    local_108 = local_108 & 0x7ffffffffffff;
  } while (iVar641 != 0);
  FUN_00a46a4c(&local_e0,&local_108,&local_e0);
  iVar641 = 0x32;
  do {
    uVar657 = local_c0 * 0x13;
    uVar670 = uStack_c8 * 2 * uVar657;
    auVar296._8_8_ = 0;
    auVar296._0_8_ = local_e0;
    auVar611._8_8_ = 0;
    auVar611._0_8_ = local_e0;
    uVar679 = local_e0 * 2;
    auVar297._8_8_ = 0;
    auVar297._0_8_ = uStack_d8;
    auVar612._8_8_ = 0;
    auVar612._0_8_ = uStack_d8;
    uVar648 = uStack_d8 * uStack_d8 + uVar670;
    auVar298._8_8_ = 0;
    auVar298._0_8_ = uStack_c8 * 2;
    auVar613._8_8_ = 0;
    auVar613._0_8_ = uVar657;
    uVar672 = uStack_d8 * 2;
    uVar667 = uStack_c8 * 0x13;
    uVar676 = local_d0 * 2;
    auVar299._8_8_ = 0;
    auVar299._0_8_ = uVar679;
    auVar614._8_8_ = 0;
    auVar614._0_8_ = local_d0;
    uVar658 = uVar648 + uVar679 * local_d0;
    auVar300._8_8_ = 0;
    auVar300._0_8_ = uVar679;
    auVar615._8_8_ = 0;
    auVar615._0_8_ = uStack_c8;
    auVar301._8_8_ = 0;
    auVar301._0_8_ = uVar672;
    auVar616._8_8_ = 0;
    auVar616._0_8_ = uStack_c8;
    auVar302._8_8_ = 0;
    auVar302._0_8_ = uVar667;
    auVar617._8_8_ = 0;
    auVar617._0_8_ = uStack_c8;
    auVar303._8_8_ = 0;
    auVar303._0_8_ = uVar676;
    auVar618._8_8_ = 0;
    auVar618._0_8_ = uVar667;
    uVar645 = local_e0 * local_e0 + uVar676 * uVar667;
    auVar304._8_8_ = 0;
    auVar304._0_8_ = uVar679;
    auVar619._8_8_ = 0;
    auVar619._0_8_ = uStack_d8;
    auVar305._8_8_ = 0;
    auVar305._0_8_ = uVar679;
    auVar620._8_8_ = 0;
    auVar620._0_8_ = local_c0;
    uVar663 = uVar679 * local_c0;
    auVar306._8_8_ = 0;
    auVar306._0_8_ = uVar657;
    auVar621._8_8_ = 0;
    auVar621._0_8_ = local_c0;
    auVar307._8_8_ = 0;
    auVar307._0_8_ = uVar672;
    auVar622._8_8_ = 0;
    auVar622._0_8_ = uVar657;
    auVar308._8_8_ = 0;
    auVar308._0_8_ = uVar676;
    auVar623._8_8_ = 0;
    auVar623._0_8_ = uVar657;
    uVar651 = uVar645 + uVar672 * uVar657;
    auVar309._8_8_ = 0;
    auVar309._0_8_ = uVar672;
    auVar624._8_8_ = 0;
    auVar624._0_8_ = local_d0;
    uVar642 = uVar672 * local_d0 + uVar657 * local_c0;
    uVar659 = uVar651 >> 0x33 |
              (SUB168(auVar296 * auVar611,8) + SUB168(auVar303 * auVar618,8) +
               (ulong)CARRY8(local_e0 * local_e0,uVar676 * uVar667) + SUB168(auVar307 * auVar622,8)
              + (ulong)CARRY8(uVar645,uVar672 * uVar657)) * 0x2000;
    uVar645 = uVar642 + uVar679 * uStack_c8;
    uVar664 = uVar658 >> 0x33 |
              (SUB168(auVar297 * auVar612,8) + SUB168(auVar298 * auVar613,8) +
               (ulong)CARRY8(uStack_d8 * uStack_d8,uVar670) + SUB168(auVar299 * auVar614,8) +
              (ulong)CARRY8(uVar648,uVar679 * local_d0)) * 0x2000;
    uVar648 = uVar645 + uVar664;
    uVar670 = uVar676 * uVar657 + uVar667 * uStack_c8;
    uVar678 = uVar648 >> 0x33 |
              (SUB168(auVar309 * auVar624,8) + SUB168(auVar306 * auVar621,8) +
               (ulong)CARRY8(uVar672 * local_d0,uVar657 * local_c0) + SUB168(auVar300 * auVar615,8)
               + (ulong)CARRY8(uVar642,uVar679 * uStack_c8) + (ulong)CARRY8(uVar645,uVar664)) *
              0x2000;
    uVar645 = uVar670 + uVar679 * uStack_d8;
    uVar642 = uVar645 + uVar659;
    auVar310._8_8_ = 0;
    auVar310._0_8_ = local_d0;
    auVar625._8_8_ = 0;
    auVar625._0_8_ = local_d0;
    uVar664 = uVar672 * uStack_c8 + local_d0 * local_d0;
    uVar669 = uVar664 + uVar663;
    uVar674 = uVar669 + uVar678;
    uVar658 = (uVar658 & 0x7ffffffffffff) +
              (uVar642 >> 0x33 |
              (SUB168(auVar308 * auVar623,8) + SUB168(auVar302 * auVar617,8) +
               (ulong)CARRY8(uVar676 * uVar657,uVar667 * uStack_c8) + SUB168(auVar304 * auVar619,8)
               + (ulong)CARRY8(uVar670,uVar679 * uStack_d8) + (ulong)CARRY8(uVar645,uVar659)) *
              0x2000);
    local_c0 = uVar674 & 0x7ffffffffffff;
    local_e0 = (uVar651 & 0x7ffffffffffff) +
               (uVar674 >> 0x33 |
               (SUB168(auVar301 * auVar616,8) + SUB168(auVar310 * auVar625,8) +
                (ulong)CARRY8(uVar672 * uStack_c8,local_d0 * local_d0) +
                SUB168(auVar305 * auVar620,8) + (ulong)CARRY8(uVar664,uVar663) +
               (ulong)CARRY8(uVar669,uVar678)) * 0x2000) * 0x13;
    uStack_c8 = (uVar648 & 0x7ffffffffffff) + (uVar658 >> 0x33);
    local_d0 = uVar658 & 0x7ffffffffffff;
    iVar641 = iVar641 + -1;
    uStack_d8 = (uVar642 & 0x7ffffffffffff) + (local_e0 >> 0x33);
    local_e0 = local_e0 & 0x7ffffffffffff;
  } while (iVar641 != 0);
  FUN_00a46a4c(&local_b8,&local_e0,&local_b8);
  iVar641 = 5;
  do {
    uVar657 = local_98 * 0x13;
    uVar670 = uStack_a0 * 2 * uVar657;
    auVar311._8_8_ = 0;
    auVar311._0_8_ = local_b8;
    auVar626._8_8_ = 0;
    auVar626._0_8_ = local_b8;
    uVar679 = local_b8 * 2;
    auVar312._8_8_ = 0;
    auVar312._0_8_ = uStack_b0;
    auVar627._8_8_ = 0;
    auVar627._0_8_ = uStack_b0;
    uVar648 = uStack_b0 * uStack_b0 + uVar670;
    auVar313._8_8_ = 0;
    auVar313._0_8_ = uStack_a0 * 2;
    auVar628._8_8_ = 0;
    auVar628._0_8_ = uVar657;
    uVar672 = uStack_b0 * 2;
    uVar667 = uStack_a0 * 0x13;
    uVar676 = local_a8 * 2;
    auVar314._8_8_ = 0;
    auVar314._0_8_ = uVar679;
    auVar629._8_8_ = 0;
    auVar629._0_8_ = local_a8;
    uVar658 = uVar648 + uVar679 * local_a8;
    auVar315._8_8_ = 0;
    auVar315._0_8_ = uVar679;
    auVar630._8_8_ = 0;
    auVar630._0_8_ = uStack_a0;
    auVar316._8_8_ = 0;
    auVar316._0_8_ = uVar672;
    auVar631._8_8_ = 0;
    auVar631._0_8_ = uStack_a0;
    auVar317._8_8_ = 0;
    auVar317._0_8_ = uVar667;
    auVar632._8_8_ = 0;
    auVar632._0_8_ = uStack_a0;
    auVar318._8_8_ = 0;
    auVar318._0_8_ = uVar676;
    auVar633._8_8_ = 0;
    auVar633._0_8_ = uVar667;
    uVar645 = local_b8 * local_b8 + uVar676 * uVar667;
    auVar319._8_8_ = 0;
    auVar319._0_8_ = uVar679;
    auVar634._8_8_ = 0;
    auVar634._0_8_ = uStack_b0;
    auVar320._8_8_ = 0;
    auVar320._0_8_ = uVar679;
    auVar635._8_8_ = 0;
    auVar635._0_8_ = local_98;
    uVar663 = uVar679 * local_98;
    auVar321._8_8_ = 0;
    auVar321._0_8_ = uVar657;
    auVar636._8_8_ = 0;
    auVar636._0_8_ = local_98;
    auVar322._8_8_ = 0;
    auVar322._0_8_ = uVar672;
    auVar637._8_8_ = 0;
    auVar637._0_8_ = uVar657;
    auVar323._8_8_ = 0;
    auVar323._0_8_ = uVar676;
    auVar638._8_8_ = 0;
    auVar638._0_8_ = uVar657;
    uVar651 = uVar645 + uVar672 * uVar657;
    auVar324._8_8_ = 0;
    auVar324._0_8_ = uVar672;
    auVar639._8_8_ = 0;
    auVar639._0_8_ = local_a8;
    uVar642 = uVar672 * local_a8 + uVar657 * local_98;
    uVar659 = uVar651 >> 0x33 |
              (SUB168(auVar311 * auVar626,8) + SUB168(auVar318 * auVar633,8) +
               (ulong)CARRY8(local_b8 * local_b8,uVar676 * uVar667) + SUB168(auVar322 * auVar637,8)
              + (ulong)CARRY8(uVar645,uVar672 * uVar657)) * 0x2000;
    uVar645 = uVar642 + uVar679 * uStack_a0;
    uVar664 = uVar658 >> 0x33 |
              (SUB168(auVar312 * auVar627,8) + SUB168(auVar313 * auVar628,8) +
               (ulong)CARRY8(uStack_b0 * uStack_b0,uVar670) + SUB168(auVar314 * auVar629,8) +
              (ulong)CARRY8(uVar648,uVar679 * local_a8)) * 0x2000;
    uVar648 = uVar645 + uVar664;
    uVar670 = uVar676 * uVar657 + uVar667 * uStack_a0;
    uVar678 = uVar648 >> 0x33 |
              (SUB168(auVar324 * auVar639,8) + SUB168(auVar321 * auVar636,8) +
               (ulong)CARRY8(uVar672 * local_a8,uVar657 * local_98) + SUB168(auVar315 * auVar630,8)
               + (ulong)CARRY8(uVar642,uVar679 * uStack_a0) + (ulong)CARRY8(uVar645,uVar664)) *
              0x2000;
    uVar645 = uVar670 + uVar679 * uStack_b0;
    uVar642 = uVar645 + uVar659;
    auVar325._8_8_ = 0;
    auVar325._0_8_ = local_a8;
    auVar640._8_8_ = 0;
    auVar640._0_8_ = local_a8;
    uVar664 = uVar672 * uStack_a0 + local_a8 * local_a8;
    uVar669 = uVar664 + uVar663;
    uVar674 = uVar669 + uVar678;
    uVar658 = (uVar658 & 0x7ffffffffffff) +
              (uVar642 >> 0x33 |
              (SUB168(auVar323 * auVar638,8) + SUB168(auVar317 * auVar632,8) +
               (ulong)CARRY8(uVar676 * uVar657,uVar667 * uStack_a0) + SUB168(auVar319 * auVar634,8)
               + (ulong)CARRY8(uVar670,uVar679 * uStack_b0) + (ulong)CARRY8(uVar645,uVar659)) *
              0x2000);
    local_98 = uVar674 & 0x7ffffffffffff;
    local_b8 = (uVar651 & 0x7ffffffffffff) +
               (uVar674 >> 0x33 |
               (SUB168(auVar316 * auVar631,8) + SUB168(auVar325 * auVar640,8) +
                (ulong)CARRY8(uVar672 * uStack_a0,local_a8 * local_a8) +
                SUB168(auVar320 * auVar635,8) + (ulong)CARRY8(uVar664,uVar663) +
               (ulong)CARRY8(uVar669,uVar678)) * 0x2000) * 0x13;
    uStack_a0 = (uVar648 & 0x7ffffffffffff) + (uVar658 >> 0x33);
    local_a8 = uVar658 & 0x7ffffffffffff;
    iVar641 = iVar641 + -1;
    uStack_b0 = (uVar642 & 0x7ffffffffffff) + (local_b8 >> 0x33);
    local_b8 = local_b8 & 0x7ffffffffffff;
  } while (iVar641 != 0);
  FUN_00a46a4c(&local_180,&local_b8,&local_90);
  FUN_00a46a4c(&local_158,&local_158,&local_180);
  uVar645 = local_158 +
            (local_138 +
             (local_140 + (local_148 + (uStack_150 + (local_158 + 0x13 >> 0x33) >> 0x33) >> 0x33) >>
             0x33) >> 0x33) * 0x13;
  param_1[1] = (char)(uVar645 >> 8);
  uVar648 = uStack_150 + (uVar645 >> 0x33);
  *param_1 = (char)uVar645;
  param_1[2] = (char)(uVar645 >> 0x10);
  param_1[3] = (char)(uVar645 >> 0x18);
  param_1[4] = (char)(uVar645 >> 0x20);
  param_1[5] = (char)(uVar645 >> 0x28);
  uVar658 = local_148 + (uVar648 >> 0x33);
  param_1[6] = (byte)(uVar645 >> 0x30) & 7 | (byte)((int)uVar648 << 3);
  param_1[7] = (char)(uVar648 >> 5);
  param_1[8] = (char)(uVar648 >> 0xd);
  param_1[9] = (char)(uVar648 >> 0x15);
  param_1[10] = (char)(uVar648 >> 0x1d);
  uVar645 = local_140 + (uVar658 >> 0x33);
  param_1[0xb] = (char)(uVar648 >> 0x25);
  param_1[0xc] = (byte)(uVar648 >> 0x2d) & 0x3f | (byte)((int)uVar658 << 6);
  param_1[0xd] = (char)(uVar658 >> 2);
  param_1[0xe] = (char)(uVar658 >> 10);
  uVar648 = local_138 + (uVar645 >> 0x33);
  param_1[0xf] = (char)(uVar658 >> 0x12);
  param_1[0x10] = (char)(uVar658 >> 0x1a);
  param_1[0x11] = (char)(uVar658 >> 0x22);
  param_1[0x12] = (char)(uVar658 >> 0x2a);
  param_1[0x13] = (byte)(uVar658 >> 0x32) & 1 | (byte)((int)uVar645 << 1);
  param_1[0x14] = (char)(uVar645 >> 7);
  param_1[0x15] = (char)(uVar645 >> 0xf);
  param_1[0x16] = (char)(uVar645 >> 0x17);
  param_1[0x17] = (char)(uVar645 >> 0x1f);
  param_1[0x18] = (char)(uVar645 >> 0x27);
  param_1[0x19] = (byte)(uVar645 >> 0x2f) & 0xf | (byte)((int)uVar648 << 4);
  param_1[0x1a] = (char)(uVar648 >> 4);
  param_1[0x1b] = (char)(uVar648 >> 0xc);
  param_1[0x1c] = (char)(uVar648 >> 0x14);
  param_1[0x1d] = (char)(uVar648 >> 0x1c);
  param_1[0x1e] = (char)(uVar648 >> 0x24);
  param_1[0x1f] = (byte)(uVar648 >> 0x2c) & 0x7f;
  OPENSSL_cleanse(&local_220,0x20);
  iVar641 = CRYPTO_memcmp(&DAT_00758c07,param_1,0x20);
  return iVar641 != 0;
}

