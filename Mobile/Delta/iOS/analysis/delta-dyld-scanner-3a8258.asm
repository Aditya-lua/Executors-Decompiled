function 0x3a8258..0x3a8778 (1312 bytes)
003a8258  sub      sp, sp, #0x90
003a825c  stp      x28, x27, [sp, #0x30]
003a8260  stp      x26, x25, [sp, #0x40]
003a8264  stp      x24, x23, [sp, #0x50]
003a8268  stp      x22, x21, [sp, #0x60]
003a826c  stp      x20, x19, [sp, #0x70]
003a8270  stp      x29, x30, [sp, #0x80]
003a8274  add      x29, sp, #0x80
003a8278  mov      x19, x0
003a827c  mov      x8, sp
003a8280  str      x8, [sp, #8]
003a8284  add      x8, sp, #8
003a8288  adrp     x22, #0xf0d000
003a828c  add      x22, x22, #0x3e0
003a8290  str      x8, [sp]
003a8294  ldr      x8, [x22]
003a8298  mov      x9, #0xc377
003a829c  movk     x9, #0xad62, lsl #16
003a82a0  movk     x9, #0x7dbf, lsl #32
003a82a4  movk     x9, #0x517c, lsl #48
003a82a8  orr      x10, x9, #0x80
003a82ac  str      x10, [sp, #0x28]
003a82b0  str      x9, [sp, #0x20]
003a82b4  ldr      x9, [sp, #0x28]
003a82b8  ldr      x10, [sp, #0x20]
003a82bc  eor      x11, x10, x9
003a82c0  and      x12, x11, x8
003a82c4  mvn      x13, x8
003a82c8  add      x8, x8, #1
003a82cc  add      x13, x8, x13, lsl #1
003a82d0  eon      x9, x10, x9
003a82d4  add      x9, x11, x9, lsl #1
003a82d8  add      x9, x9, #1
003a82dc  orr      x9, x9, x13
003a82e0  add      x8, x8, x11
003a82e4  add      x8, x8, x9
003a82e8  orn      x9, x8, x12
003a82ec  add      x9, x12, x9
003a82f0  orr      x8, x8, x12
003a82f4  add      x8, x9, x8
003a82f8  ldur     x8, [x8, #1]
003a82fc  blr      x8
003a8300  cbz      w0, #0x3a83d8
003a8304  mov      x21, x0
003a8308  mov      w20, #0
003a830c  mov      x23, #0x8143
003a8310  movk     x23, #0x6e57, lsl #16
003a8314  movk     x23, #0x87f7, lsl #32
003a8318  movk     x23, #0xa37b, lsl #48
003a831c  add      x24, sp, #0x10
003a8320  add      x25, sp, #0x18
003a8324  add      x26, sp, #0x20
003a8328  add      x27, sp, #0x28
003a832c  ldr      x8, [x22]
003a8330  add      x9, x23, #0x40
003a8334  str      x9, [sp, #0x28]
003a8338  str      x23, [sp, #0x20]
003a833c  ldr      x9, [sp, #0x28]
003a8340  ldr      x10, [sp, #0x20]
003a8344  eor      x9, x10, x9
003a8348  ldr      x8, [x9, x8]
003a834c  mov      x0, x20
003a8350  blr      x8
003a8354  cbz      x0, #0x3a83cc
003a8358  stp      x25, x24, [sp, #0x10]
003a835c  ldrb     w8, [x19]
003a8360  cbz      w8, #0x3a83e0
003a8364  mov      x11, #0
003a8368  mov      w10, #1
003a836c  mov      x9, x11
003a8370  ldrb     w12, [x19, x10]
003a8374  add      x10, x10, #1
003a8378  sub      x11, x11, #1
003a837c  cbnz     w12, #0x3a836c
003a8380  b        #0x3a83c4
003a8384  mov      x10, x0
003a8388  add      x0, x0, #1
003a838c  cmp      w11, w8
003a8390  b.ne     #0x3a83c4
003a8394  stp      x27, x26, [sp, #0x20]
003a8398  mov      x11, x9
003a839c  mov      w12, #1
003a83a0  cbz      x11, #0x3a83e0
003a83a4  ldrb     w13, [x10, x12]
003a83a8  ldrb     w14, [x19, x12]
003a83ac  cmp      w13, w14
003a83b0  b.ne     #0x3a83c4
003a83b4  add      x12, x12, #1
003a83b8  add      x11, x11, #1
003a83bc  cbnz     w13, #0x3a83a0
003a83c0  b        #0x3a83e0
003a83c4  ldrb     w11, [x0]
003a83c8  cbnz     w11, #0x3a8384
003a83cc  add      w20, w20, #1
003a83d0  cmp      w20, w21
003a83d4  b.ne     #0x3a832c
003a83d8  mov      x0, #0
003a83dc  b        #0x3a8430
003a83e0  ldr      x8, [x22]
003a83e4  mov      x9, #0x4f70
003a83e8  movk     x9, #0x1fc8, lsl #16
003a83ec  movk     x9, #0xab22, lsl #32
003a83f0  movk     x9, #0x403, lsl #48
003a83f4  add      x10, x9, #0x30
003a83f8  str      x10, [sp, #0x28]
003a83fc  str      x9, [sp, #0x20]
003a8400  ldr      x9, [sp, #0x28]
003a8404  ldr      x10, [sp, #0x20]
003a8408  eor      x9, x10, x9
003a840c  mvn      x10, x8
003a8410  add      x11, x8, #1
003a8414  add      x10, x11, x10, lsl #1
003a8418  orr      x10, x9, x10
003a841c  orr      x8, x9, x8
003a8420  add      x9, x11, x10
003a8424  ldr      x8, [x9, x8]
003a8428  mov      x0, x20
003a842c  blr      x8
003a8430  ldp      x29, x30, [sp, #0x80]
003a8434  ldp      x20, x19, [sp, #0x70]
003a8438  ldp      x22, x21, [sp, #0x60]
003a843c  ldp      x24, x23, [sp, #0x50]
003a8440  ldp      x26, x25, [sp, #0x40]
003a8444  ldp      x28, x27, [sp, #0x30]
003a8448  add      sp, sp, #0x90
003a844c  ret      
003a8450  adrp     x8, #0xf03000
003a8454  ldrb     w9, [x8, #0x548]
003a8458  tbnz     w9, #0, #0x3a8518
003a845c  mov      w9, #1
003a8460  strb     w9, [x8, #0x548]
003a8464  adrp     x8, #0xf03000
003a8468  add      x8, x8, #0x560
003a846c  eor      x9, x8, x8, lsr #33
003a8470  mov      x10, #0x8ccd
003a8474  movk     x10, #0xed55, lsl #16
003a8478  movk     x10, #0xafd7, lsl #32
003a847c  movk     x10, #0xff51, lsl #48
003a8480  mul      x9, x9, x10
003a8484  eor      x10, x9, x9, lsr #29
003a8488  adrp     x11, #0xf03000
003a848c  strh     w10, [x11, #0x562]
003a8490  lsr      x12, x10, #0x10
003a8494  adrp     x13, #0xf03000
003a8498  strh     w12, [x13, #0x564]
003a849c  lsr      x12, x10, #0x20
003a84a0  adrp     x14, #0xf03000
003a84a4  strh     w12, [x14, #0x566]
003a84a8  lsr      x9, x9, #0x30
003a84ac  adrp     x12, #0xf03000
003a84b0  strh     w9, [x12, #0x568]
003a84b4  ldrh     w9, [x8]
003a84b8  ldrh     w11, [x11, #0x562]
003a84bc  eor      w9, w11, w9
003a84c0  strh     w9, [x8]
003a84c4  adrp     x8, #0xf03000
003a84c8  ldrh     w9, [x8, #0x56a]
003a84cc  ldrh     w11, [x13, #0x564]
003a84d0  eor      w9, w11, w9
003a84d4  strh     w9, [x8, #0x56a]
003a84d8  adrp     x8, #0xf03000
003a84dc  ldrh     w9, [x8, #0x56c]
003a84e0  ldrh     w11, [x14, #0x566]
003a84e4  eor      w9, w11, w9
003a84e8  strh     w9, [x8, #0x56c]
003a84ec  adrp     x8, #0xf03000
003a84f0  ldrh     w9, [x8, #0x56e]
003a84f4  ldrh     w11, [x12, #0x568]
003a84f8  eor      w9, w11, w9
003a84fc  strh     w9, [x8, #0x56e]
003a8500  adrp     x8, #0xf03000
003a8504  ldr      x9, [x8, #0x570]
003a8508  eor      x9, x9, x10
003a850c  str      x9, [x8, #0x570]
003a8510  adrp     x8, #0xf03000
003a8514  str      wzr, [x8, #0x540]
003a8518  ret      
003a851c  adrp     x8, #0xf03000
003a8520  ldrb     w9, [x8, #0x558]
003a8524  tbnz     w9, #0, #0x3a85e4
003a8528  mov      w9, #1
003a852c  strb     w9, [x8, #0x558]
003a8530  adrp     x8, #0xf03000
003a8534  add      x8, x8, #0x578
003a8538  eor      x9, x8, x8, lsr #33
003a853c  mov      x10, #0x8ccd
003a8540  movk     x10, #0xed55, lsl #16
003a8544  movk     x10, #0xafd7, lsl #32
003a8548  movk     x10, #0xff51, lsl #48
003a854c  mul      x9, x9, x10
003a8550  eor      x10, x9, x9, lsr #29
003a8554  adrp     x11, #0xf03000
003a8558  strh     w10, [x11, #0x57a]
003a855c  lsr      x12, x10, #0x10
003a8560  adrp     x13, #0xf03000
003a8564  strh     w12, [x13, #0x57c]
003a8568  lsr      x12, x10, #0x20
003a856c  adrp     x14, #0xf03000
003a8570  strh     w12, [x14, #0x57e]
003a8574  lsr      x9, x9, #0x30
003a8578  adrp     x12, #0xf03000
003a857c  strh     w9, [x12, #0x580]
003a8580  ldrh     w9, [x8]
003a8584  ldrh     w11, [x11, #0x57a]
003a8588  eor      w9, w11, w9
003a858c  strh     w9, [x8]
003a8590  adrp     x8, #0xf03000
003a8594  ldrh     w9, [x8, #0x582]
003a8598  ldrh     w11, [x13, #0x57c]
003a859c  eor      w9, w11, w9
003a85a0  strh     w9, [x8, #0x582]
003a85a4  adrp     x8, #0xf03000
003a85a8  ldrh     w9, [x8, #0x584]
003a85ac  ldrh     w11, [x14, #0x57e]
003a85b0  eor      w9, w11, w9
003a85b4  strh     w9, [x8, #0x584]
003a85b8  adrp     x8, #0xf03000
003a85bc  ldrh     w9, [x8, #0x586]
003a85c0  ldrh     w11, [x12, #0x580]
003a85c4  eor      w9, w11, w9
003a85c8  strh     w9, [x8, #0x586]
003a85cc  adrp     x8, #0xf03000
003a85d0  ldr      x9, [x8, #0x588]
003a85d4  eor      x9, x9, x10
003a85d8  str      x9, [x8, #0x588]
003a85dc  adrp     x8, #0xf03000
003a85e0  str      wzr, [x8, #0x550]
003a85e4  ret      
003a85e8  ret      
003a85ec  sub      sp, sp, #0xc0
003a85f0  stp      x22, x21, [sp, #0x90]
003a85f4  stp      x20, x19, [sp, #0xa0]
003a85f8  stp      x29, x30, [sp, #0xb0]
003a85fc  add      x29, sp, #0xb0
003a8600  adrp     x8, #0xe5c000
003a8604  ldr      x8, [x8, #0xd8]
003a8608  ldr      x8, [x8]
003a860c  stur     x8, [x29, #-0x28]
003a8610  mov      x8, #0xff8d00000000
003a8614  movk     x8, #0xffff, lsl #48
003a8618  str      x8, [sp, #8]
003a861c  add      x8, sp, #0x10
003a8620  str      x8, [sp, #0x18]
003a8624  add      x8, sp, #0x18
003a8628  str      x8, [sp, #0x10]
003a862c  add      x8, sp, #0x20
003a8630  str      x8, [sp, #0x28]
003a8634  add      x8, sp, #0x28
003a8638  str      x8, [sp, #0x20]
003a863c  str      wzr, [sp, #0x34]
003a8640  ldr      w8, [sp, #0x34]
003a8644  cbz      w8, #0x3a8650
003a8648  mov      w8, #-0x73
003a864c  b        #0x3a8e54
003a8650  add      x8, sp, #8
003a8654  orr      x8, x8, #4
003a8658  adrp     x9, #0xf03000
003a865c  adrp     x10, #0xf11000
003a8660  mov      w11, #0x18
003a8664  adrp     x12, #0xf03000
003a8668  add      x12, x12, #0x819
003a866c  add      x13, sp, #0x38
003a8670  add      x14, sp, #0x40
003a8674  fmov     d0, #-2.00000000
003a8678  mov      x15, #-0x3fa3000000000000
003a867c  mov      w16, #0x12
003a8680  mov      w17, #0x1b
003a8684  mov      w0, #0xc
003a8688  mov      x1, #0x400000000000
003a868c  movk     x1, #0xc05d, lsl #48
003a8690  mov      x2, #0x800000000000
003a8694  movk     x2, #0xc05d, lsl #48
003a8698  mov      x3, #0xc00000000000
003a869c  movk     x3, #0xc05d, lsl #48
003a86a0  adrp     x4, #0xf03000
003a86a4  add      x4, x4, #0x818
003a86a8  b        #0x3a86d8
003a86ac  mov      w19, #1
003a86b0  add      w5, w6, w5
003a86b4  and      w6, w19, w7
003a86b8  sub      w5, w5, w6, lsl #1
003a86bc  ldrsw    x6, [sp, #0x34]
003a86c0  str      w5, [x8, x6, lsl #2]
003a86c4  ldr      w5, [sp, #0x34]
003a86c8  add      w5, w5, #1
003a86cc  str      w5, [sp, #0x34]
003a86d0  ldr      w5, [sp, #0x34]
003a86d4  cbnz     w5, #0x3a8e50
003a86d8  ldrsb    w5, [x9, #0x818]
003a86dc  ldrsb    w6, [x10, #0xcfa]
003a86e0  madd     w5, w6, w11, w5
003a86e4  cmp      w5, #3
003a86e8  b.eq     #0x3a8850
003a86ec  ldrsw    x5, [sp, #0x34]
003a86f0  ldr      w5, [x8, x5, lsl #2]
003a86f4  stp      x14, x13, [sp, #0x38]
003a86f8  ldrsb    w6, [x4, #4]
003a86fc  scvtf    d1, w6
003a8700  ldrsb    w6, [x4]
003a8704  scvtf    d2, w6
003a8708  fmadd    d1, d2, d0, d1
003a870c  fmov     d2, x3
003a8710  fmul     d1, d1, d2
003a8714  stur     d1, [x29, #-0x50]
003a8718  ldrsb    w6, [x4, #1]
003a871c  add      w6, w6, #7
003a8720  ldrsb    w7, [x4, #2]
003a8724  udiv     w6, w6, w7
003a8728  ldrsb    w7, [x4, #3]
003a872c  cmp      w6, w7
003a8730  b.eq     #0x3a8748
003a8734  ldrsb    w6, [x9, #0x818]
003a8738  ldrsb    w7, [x10, #0xcfa]
003a873c  madd     w6, w7, w16, w6
003a8740  cmp      w6, #3
003a8744  b.ne     #0x3a8790
003a8748  ldrsb    w6, [x12]
003a874c  add      w6, w6, #7
003a8750  ldrsb    w7, [x12, #1]
003a8754  udiv     w7, w6, w7
003a8758  ldrsb    w19, [x12, #2]
003a875c  cmp      w7, w19
003a8760  b.eq     #0x3a8794
003a8764  ldur     d1, [x29, #-0x50]
003a8768  ldrsb    w6, [x12]
003a876c  add      w6, w6, #7
003a8770  ldrsb    w7, [x12, #1]
003a8774  udiv     w6, w6, w7
