; ossl_ipaddr_to_asc @ 00b07080
00b07080	sub sp,sp,#0x80
00b07084	stp x20,x19,[sp, #0x60]
00b07088	cmp w1,#0x4
00b0708c	mov x19,x0
00b07090	str x25,[sp, #0x30]
00b07094	stp x24,x23,[sp, #0x40]
00b07098	stp x22,x21,[sp, #0x50]
00b0709c	stp x29,x30,[sp, #0x70]
00b070a0	add x29,sp,#0x70
00b070a4	b.eq 0x00b07110
00b070a8	mov w3,w1
00b070ac	cmp w1,#0x10
00b070b0	b.ne 0x00b07138
00b070b4	adrp x22,0x2d6000
00b070b8	adrp x23,0x2cc000
00b070bc	mov w24,#0x8
00b070c0	mov w21,#0x28
00b070c4	add x20,sp,#0x8
00b070c8	add x22,x22,#0x745
00b070cc	add x23,x23,#0x1cd
00b070d0	ldrb w8,[x19]
00b070d4	ldrb w3,[x19, #0x1]
00b070d8	subs w25,w24,#0x1
00b070dc	csel x2,x23,x22,hi
00b070e0	sxtw x1,w21
00b070e4	bfm w3,w8,#0x18,#0x7
00b070e8	mov x0,x20
00b070ec	bl 0x00c34d30
00b070f0	cmp w24,#0x2
00b070f4	b.cc 0x00b0714c
00b070f8	sub w21,w21,w0
00b070fc	add x20,x20,w0, SXTW 
00b07100	add x19,x19,#0x2
00b07104	mov w24,w25
00b07108	tbz w0,#0x1f,0x00b070d0
00b0710c	b 0x00b0714c
00b07110	ldrb w3,[x19]
00b07114	ldrb w4,[x19, #0x1]
00b07118	ldrb w5,[x19, #0x2]
00b0711c	ldrb w6,[x19, #0x3]
00b07120	adrp x2,0x2c4000
00b07124	add x2,x2,#0x2d4
00b07128	add x0,sp,#0x8
00b0712c	mov w1,#0x28
00b07130	bl 0x00c34d30
00b07134	b 0x00b0714c
00b07138	adrp x2,0x2dc000
00b0713c	add x2,x2,#0xae9
00b07140	add x0,sp,#0x8
00b07144	mov w1,#0x28
00b07148	bl 0x00c34d30
00b0714c	adrp x1,0x2c2000
00b07150	add x1,x1,#0x5ca
00b07154	add x0,sp,#0x8
00b07158	mov w2,#0x429
00b0715c	bl 0x00c34600
00b07160	ldp x29,x30,[sp, #0x70]
00b07164	ldp x20,x19,[sp, #0x60]
00b07168	ldp x22,x21,[sp, #0x50]
00b0716c	ldp x24,x23,[sp, #0x40]
00b07170	ldr x25,[sp, #0x30]
00b07174	add sp,sp,#0x80
00b07178	ret
