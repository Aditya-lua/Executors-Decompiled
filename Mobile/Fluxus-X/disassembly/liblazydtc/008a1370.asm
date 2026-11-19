; FUN_008a1370 @ 008a1370
008a1370	stp x29,x30,[sp, #-0x20]!
008a1374	str x19,[sp, #0x10]
008a1378	mov x29,sp
008a137c	mov x19,x0
008a1380	ldr x0,[x0, #0x18]
008a1384	adrp x8,0xc4c000
008a1388	add x8,x8,#0x48
008a138c	str x8,[x19]
008a1390	cbz x0,0x008a13c0
008a1394	bl 0x00c301d0
008a1398	ldr x0,[x19, #0x30]
008a139c	str xzr,[x19, #0x18]
008a13a0	bl 0x00c301d0
008a13a4	mov x0,xzr
008a13a8	stp xzr,xzr,[x19, #0x20]
008a13ac	str xzr,[x19, #0x30]
008a13b0	bl 0x00c301d0
008a13b4	mov w8,#0x40
008a13b8	str xzr,[x19, #0x38]
008a13bc	strb w8,[x19, #0x48]
008a13c0	ldr x0,[x19, #0x30]
008a13c4	bl 0x00c301d0
008a13c8	mov x0,x19
008a13cc	mov w1,#0x60
008a13d0	ldr x19,[sp, #0x10]
008a13d4	ldp x29,x30,[sp], #0x20
008a13d8	b 0x00c2fe80
