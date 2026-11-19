; ossl_siv128_new @ 00b25f94
00b25f94	str x25,[sp, #-0x50]!
00b25f98	stp x24,x23,[sp, #0x10]
00b25f9c	mov w24,w1
00b25fa0	adrp x1,0x2d6000
00b25fa4	mov x23,x2
00b25fa8	mov x25,x0
00b25fac	add x1,x1,#0xb10
00b25fb0	mov w0,#0x40
00b25fb4	mov w2,#0x96
00b25fb8	stp x22,x21,[sp, #0x20]
00b25fbc	stp x20,x19,[sp, #0x30]
00b25fc0	stp x29,x30,[sp, #0x40]
00b25fc4	add x29,sp,#0x40
00b25fc8	mov x20,x5
00b25fcc	mov x21,x4
00b25fd0	mov x22,x3
00b25fd4	bl 0x00c32320
00b25fd8	mov x19,x0
00b25fdc	cbz x0,0x00b2601c
00b25fe0	mov x0,x19
00b25fe4	mov x1,x25
00b25fe8	mov w2,w24
00b25fec	mov x3,x23
00b25ff0	mov x4,x22
00b25ff4	mov x5,x21
00b25ff8	mov x6,x20
00b25ffc	bl 0x00b26038
00b26000	cbnz w0,0x00b2601c
00b26004	adrp x1,0x2d6000
00b26008	add x1,x1,#0xb10
00b2600c	mov w2,#0x9a
00b26010	mov x0,x19
00b26014	bl 0x00c32310
00b26018	mov x19,xzr
00b2601c	mov x0,x19
00b26020	ldp x29,x30,[sp, #0x40]
00b26024	ldp x20,x19,[sp, #0x30]
00b26028	ldp x22,x21,[sp, #0x20]
00b2602c	ldp x24,x23,[sp, #0x10]
00b26030	ldr x25,[sp], #0x50
00b26034	ret
