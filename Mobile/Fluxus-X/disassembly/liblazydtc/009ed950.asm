; FUN_009ed950 @ 009ed950
009ed950	sub sp,sp,#0x90
009ed954	and w8,w2,#0x7
009ed958	stp x24,x23,[sp, #0x50]
009ed95c	stp x22,x21,[sp, #0x60]
009ed960	stp x20,x19,[sp, #0x70]
009ed964	mov x19,x6
009ed968	mov x20,x5
009ed96c	mov x21,x4
009ed970	mov w23,w2
009ed974	mov w24,w1
009ed978	cmp w8,#0x2
009ed97c	mov x9,x0
009ed980	stp x28,x27,[sp, #0x30]
009ed984	stp x26,x25,[sp, #0x40]
009ed988	stp x29,x30,[sp, #0x80]
009ed98c	add x29,sp,#0x80
009ed990	b.eq 0x009ed9cc
009ed994	cmp w8,#0x4
009ed998	b.ne 0x009ed9d0
009ed99c	tst w24,#0x3
009ed9a0	b.eq 0x009ed9d0
009ed9a4	bl 0x00c342a0
009ed9a8	adrp x0,0x2bb000
009ed9ac	adrp x2,0x2a5000
009ed9b0	add x0,x0,#0x95a
009ed9b4	add x2,x2,#0xbfa
009ed9b8	mov w1,#0x9b
009ed9bc	bl 0x00c342b0
009ed9c0	mov w0,#0xd
009ed9c4	mov w1,#0x85
009ed9c8	b 0x009edb90
009ed9cc	tbnz w24,#0x0,0x009edb6c
009ed9d0	cbz w24,0x009edb64
009ed9d4	mov w28,wzr
009ed9d8	add x25,x9,w24, SXTW 
009ed9dc	and x8,x23,#0x7
009ed9e0	mov x26,x9
009ed9e4	stp x9,x8,[sp, #0x8]
009ed9e8	str w3,[sp, #0x1c]
009ed9ec	and w8,w3,#0x1
009ed9f0	cmp x26,x9
009ed9f4	and w9,w23,#0x7
009ed9f8	ccmp w8,#0x0,#0x4,eq
009ed9fc	mov w8,#0x20
009eda00	csel w27,wzr,w8,eq
009eda04	cmp w9,#0x4
009eda08	mov w0,#0xffffffff
009eda0c	b.hi 0x009edb9c
009eda10	ldr x8,[sp, #0x10]
009eda14	adrp x9,0x74d000
009eda18	add x9,x9,#0xd60
009eda1c	ldrsw x8,[x9, x8, LSL #0x2]
009eda20	add x8,x8,x9
009eda24	br x8
009eda28	add x2,sp,#0x28
009eda2c	mov x0,x26
009eda30	mov w1,w24
009eda34	bl 0x00c37820
009eda38	tbnz w0,#0x1f,0x009edb98
009eda3c	ldr w3,[sp, #0x1c]
009eda40	sub w24,w24,w0
009eda44	add x26,x26,w0, SXTW 
009eda48	b 0x009edaa8
009eda4c	ldrb w8,[x26], #0x1
009eda50	b 0x009edaa4
009eda54	ldrb w8,[x26]
009eda58	lsl x9,x8,#0x8
009eda5c	str x9,[sp, #0x28]
009eda60	ldrb w9,[x26, #0x1]
009eda64	add x26,x26,#0x2
009eda68	bfm x9,x8,#0x38,#0x7
009eda6c	str x9,[sp, #0x28]
009eda70	b 0x009edaa8
009eda74	ldrb w8,[x26]
009eda78	lsl x8,x8,#0x18
009eda7c	str x8,[sp, #0x28]
009eda80	ldrb w9,[x26, #0x1]
009eda84	bfm x8,x9,#0x30,#0x7
009eda88	str x8,[sp, #0x28]
009eda8c	ldrb w9,[x26, #0x2]
009eda90	bfm x8,x9,#0x38,#0x7
009eda94	str x8,[sp, #0x28]
009eda98	ldrb w9,[x26, #0x3]
009eda9c	add x26,x26,#0x4
009edaa0	orr x8,x8,x9
009edaa4	str x8,[sp, #0x28]
009edaa8	and w8,w3,#0x1
009edaac	cmp x26,x25
009edab0	ccmp w8,#0x0,#0x4,eq
009edab4	mov w8,#0x40
009edab8	mov x22,x25
009edabc	csel w25,w27,w8,eq
009edac0	tbnz w23,#0x3,0x009edae8
009edac4	ldr x0,[sp, #0x28]
009edac8	orr w1,w25,w3
009edacc	mov x2,x21
009edad0	mov x3,x20
009edad4	mov x4,x19
009edad8	bl 0x009edbbc
009edadc	tbnz w0,#0x1f,0x009edb98
009edae0	add w28,w0,w28
009edae4	b 0x009edb48
009edae8	ldr x2,[sp, #0x28]
009edaec	add x0,sp,#0x20
009edaf0	orr w1,wzr,#0x6
009edaf4	bl 0x00c37830
009edaf8	cmp w0,#0x1
009edafc	str w24,[sp, #0x4]
009edb00	b.lt 0x009edb44
009edb04	ldr w8,[sp, #0x1c]
009edb08	mov x24,xzr
009edb0c	orr w27,w25,w8
009edb10	sxtw x25,w0
009edb14	add x8,sp,#0x20
009edb18	ldrb w0,[x8, x24]
009edb1c	mov w1,w27
009edb20	mov x2,x21
009edb24	mov x3,x20
009edb28	mov x4,x19
009edb2c	bl 0x009edbbc
009edb30	tbnz w0,#0x1f,0x009edb98
009edb34	add x24,x24,#0x1
009edb38	cmp x24,x25
009edb3c	add w28,w0,w28
009edb40	b.lt 0x009edb14
009edb44	ldr w24,[sp, #0x4]
009edb48	ldr x9,[sp, #0x8]
009edb4c	ldr w3,[sp, #0x1c]
009edb50	mov x25,x22
009edb54	cmp x26,x22
009edb58	mov w0,w28
009edb5c	b.ne 0x009ed9ec
009edb60	b 0x009edb9c
009edb64	mov w0,wzr
009edb68	b 0x009edb9c
009edb6c	bl 0x00c342a0
009edb70	adrp x0,0x2bb000
009edb74	adrp x2,0x2a5000
009edb78	add x0,x0,#0x95a
009edb7c	add x2,x2,#0xbfa
009edb80	mov w1,#0xa1
009edb84	bl 0x00c342b0
009edb88	mov w0,#0xd
009edb8c	mov w1,#0x81
009edb90	mov x2,xzr
009edb94	bl 0x00c342c0
009edb98	mov w0,#0xffffffff
009edb9c	ldp x29,x30,[sp, #0x80]
009edba0	ldp x20,x19,[sp, #0x70]
009edba4	ldp x22,x21,[sp, #0x60]
009edba8	ldp x24,x23,[sp, #0x50]
009edbac	ldp x26,x25,[sp, #0x40]
009edbb0	ldp x28,x27,[sp, #0x30]
009edbb4	add sp,sp,#0x90
009edbb8	ret
