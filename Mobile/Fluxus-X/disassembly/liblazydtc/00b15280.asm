; X509_NAME_ENTRY_create_by_NID @ 00b15280
00b15280	str x23,[sp, #-0x40]!
00b15284	mov x23,x0
00b15288	mov w0,w1
00b1528c	stp x22,x21,[sp, #0x10]
00b15290	stp x20,x19,[sp, #0x20]
00b15294	stp x29,x30,[sp, #0x30]
00b15298	add x29,sp,#0x30
00b1529c	mov w19,w4
00b152a0	mov x20,x3
00b152a4	mov w22,w2
00b152a8	bl 0x00c37740
00b152ac	cbz x0,0x00b152e0
00b152b0	mov x21,x0
00b152b4	mov x0,x23
00b152b8	mov x1,x21
00b152bc	mov w2,w22
00b152c0	mov x3,x20
00b152c4	mov w4,w19
00b152c8	bl 0x00b14f48
00b152cc	mov x19,x0
00b152d0	mov x0,x21
00b152d4	bl 0x00c37660
00b152d8	mov x0,x19
00b152dc	b 0x00b15310
00b152e0	bl 0x00c342a0
00b152e4	adrp x0,0x2a0000
00b152e8	adrp x2,0x2b4000
00b152ec	add x0,x0,#0xe2d
00b152f0	add x2,x2,#0xbca
00b152f4	mov w1,#0x10f
00b152f8	bl 0x00c342b0
00b152fc	mov w0,#0xb
00b15300	mov w1,#0x6d
00b15304	mov x2,xzr
00b15308	bl 0x00c342c0
00b1530c	mov x0,xzr
00b15310	ldp x29,x30,[sp, #0x30]
00b15314	ldp x20,x19,[sp, #0x20]
00b15318	ldp x22,x21,[sp, #0x10]
00b1531c	ldr x23,[sp], #0x40
00b15320	ret
