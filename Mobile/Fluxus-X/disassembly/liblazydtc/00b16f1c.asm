; ossl_asn1_item_digest_ex @ 00b16f1c
00b16f1c	sub sp,sp,#0x60
00b16f20	mov x8,x0
00b16f24	stp x20,x19,[sp, #0x40]
00b16f28	mov x19,x1
00b16f2c	add x1,sp,#0x8
00b16f30	mov x0,x2
00b16f34	mov x2,x8
00b16f38	stp x26,x25,[sp, #0x10]
00b16f3c	stp x24,x23,[sp, #0x20]
00b16f40	stp x22,x21,[sp, #0x30]
00b16f44	stp x29,x30,[sp, #0x50]
00b16f48	add x29,sp,#0x50
00b16f4c	mov x23,x6
00b16f50	mov x24,x5
00b16f54	mov x20,x4
00b16f58	mov x21,x3
00b16f5c	str xzr,[sp, #0x8]
00b16f60	bl 0x00c36170
00b16f64	mov w22,w0
00b16f68	mov w26,wzr
00b16f6c	tbnz w0,#0x1f,0x00b16ff4
00b16f70	ldr x8,[sp, #0x8]
00b16f74	cbz x8,0x00b16ff4
00b16f78	mov x0,x19
00b16f7c	bl 0x00c35810
00b16f80	mov x25,x19
00b16f84	cbz x0,0x00b16fb0
00b16f88	cbz x25,0x00b16fcc
00b16f8c	ldr x0,[sp, #0x8]
00b16f90	sxtw x1,w22
00b16f94	mov x2,x21
00b16f98	mov x3,x20
00b16f9c	mov x4,x25
00b16fa0	mov x5,xzr
00b16fa4	bl 0x00c370c0
00b16fa8	mov w26,w0
00b16fac	b 0x00b16fd0
00b16fb0	mov x0,x19
00b16fb4	bl 0x00c34c30
00b16fb8	bl 0x00c368c0
00b16fbc	cbz x0,0x00b17014
00b16fc0	bl 0x00c32360
00b16fc4	mov x25,x19
00b16fc8	cbnz x25,0x00b16f8c
00b16fcc	mov w26,wzr
00b16fd0	ldr x0,[sp, #0x8]
00b16fd4	adrp x1,0x2a4000
00b16fd8	add x1,x1,#0xb78
00b16fdc	mov w2,#0x53
00b16fe0	bl 0x00c32310
00b16fe4	cmp x25,x19
00b16fe8	b.eq 0x00b16ff4
00b16fec	mov x0,x25
00b16ff0	bl 0x00c35800
00b16ff4	mov w0,w26
00b16ff8	ldp x29,x30,[sp, #0x50]
00b16ffc	ldp x20,x19,[sp, #0x40]
00b17000	ldp x22,x21,[sp, #0x30]
00b17004	ldp x24,x23,[sp, #0x20]
00b17008	ldp x26,x25,[sp, #0x10]
00b1700c	add sp,sp,#0x60
00b17010	ret
00b17014	mov x0,x19
00b17018	bl 0x00c36230
00b1701c	mov x1,x0
00b17020	mov x0,x24
00b17024	mov x2,x23
00b17028	bl 0x00c357f0
00b1702c	mov x25,x0
00b17030	cbnz x25,0x00b16f8c
00b17034	b 0x00b16fcc
