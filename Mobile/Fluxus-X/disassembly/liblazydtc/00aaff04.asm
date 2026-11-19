; OCSP_single_get0_status @ 00aaff04
00aaff04	str x23,[sp, #-0x40]!
00aaff08	stp x22,x21,[sp, #0x10]
00aaff0c	stp x20,x19,[sp, #0x20]
00aaff10	stp x29,x30,[sp, #0x30]
00aaff14	add x29,sp,#0x30
00aaff18	cbz x0,0x00aaff7c
00aaff1c	ldr x8,[x0, #0x8]
00aaff20	mov x20,x4
00aaff24	mov x22,x3
00aaff28	mov x21,x0
00aaff2c	ldr w19,[x8]
00aaff30	cmp w19,#0x1
00aaff34	b.ne 0x00aaff60
00aaff38	ldr x8,[x8, #0x8]
00aaff3c	mov x23,x1
00aaff40	cbz x2,0x00aaff4c
00aaff44	ldr x9,[x8]
00aaff48	str x9,[x2]
00aaff4c	cbz x23,0x00aaff60
00aaff50	ldr x0,[x8, #0x8]
00aaff54	cbz x0,0x00aaff98
00aaff58	bl 0x00c37540
00aaff5c	str w0,[x23]
00aaff60	cbz x22,0x00aaff6c
00aaff64	ldr x8,[x21, #0x10]
00aaff68	str x8,[x22]
00aaff6c	cbz x20,0x00aaff80
00aaff70	ldr x8,[x21, #0x18]
00aaff74	str x8,[x20]
00aaff78	b 0x00aaff80
00aaff7c	mov w19,#0xffffffff
00aaff80	mov w0,w19
00aaff84	ldp x29,x30,[sp, #0x30]
00aaff88	ldp x20,x19,[sp, #0x20]
00aaff8c	ldp x22,x21,[sp, #0x10]
00aaff90	ldr x23,[sp], #0x40
00aaff94	ret
00aaff98	mov w8,#0xffffffff
00aaff9c	str w8,[x23]
00aaffa0	cbnz x22,0x00aaff64
00aaffa4	b 0x00aaff6c
