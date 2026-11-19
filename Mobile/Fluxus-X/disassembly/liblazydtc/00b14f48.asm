; X509_NAME_ENTRY_create_by_OBJ @ 00b14f48
00b14f48	stp x24,x23,[sp, #-0x40]!
00b14f4c	stp x22,x21,[sp, #0x10]
00b14f50	stp x20,x19,[sp, #0x20]
00b14f54	mov w21,w4
00b14f58	mov x22,x3
00b14f5c	mov w23,w2
00b14f60	mov x24,x1
00b14f64	mov x20,x0
00b14f68	stp x29,x30,[sp, #0x30]
00b14f6c	add x29,sp,#0x30
00b14f70	cbz x0,0x00b14f7c
00b14f74	ldr x19,[x20]
00b14f78	cbnz x19,0x00b14f88
00b14f7c	bl 0x00c40ea0
00b14f80	mov x19,x0
00b14f84	cbz x0,0x00b15020
00b14f88	cbz x24,0x00b14fd4
00b14f8c	cbz x19,0x00b14fd4
00b14f90	ldr x0,[x19]
00b14f94	bl 0x00c37660
00b14f98	mov x0,x24
00b14f9c	bl 0x00c37730
00b14fa0	str x0,[x19]
00b14fa4	cbz x0,0x00b15004
00b14fa8	mov x0,x19
00b14fac	mov w1,w23
00b14fb0	mov x2,x22
00b14fb4	mov w3,w21
00b14fb8	bl 0x00b1553c
00b14fbc	cbz w0,0x00b15004
00b14fc0	cbz x20,0x00b15020
00b14fc4	ldr x8,[x20]
00b14fc8	cbnz x8,0x00b15020
00b14fcc	str x19,[x20]
00b14fd0	b 0x00b15020
00b14fd4	bl 0x00c342a0
00b14fd8	adrp x0,0x2a0000
00b14fdc	adrp x2,0x2cc000
00b14fe0	add x0,x0,#0xe2d
00b14fe4	add x2,x2,#0x2ed
00b14fe8	mov w1,#0x135
00b14fec	bl 0x00c342b0
00b14ff0	mov w1,#0x102
00b14ff4	mov w0,#0xb
00b14ff8	movk w1,#0xc, LSL #16
00b14ffc	mov x2,xzr
00b15000	bl 0x00c342c0
00b15004	cbz x20,0x00b15014
00b15008	ldr x8,[x20]
00b1500c	cmp x19,x8
00b15010	b.eq 0x00b1501c
00b15014	mov x0,x19
00b15018	bl 0x00c40940
00b1501c	mov x19,xzr
00b15020	mov x0,x19
00b15024	ldp x29,x30,[sp, #0x30]
00b15028	ldp x20,x19,[sp, #0x20]
00b1502c	ldp x22,x21,[sp, #0x10]
00b15030	ldp x24,x23,[sp], #0x40
00b15034	ret
