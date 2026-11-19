; ossl_bsearch @ 00aaf0cc
00aaf0cc	str x27,[sp, #-0x60]!
00aaf0d0	stp x20,x19,[sp, #0x40]
00aaf0d4	mov w20,w3
00aaf0d8	stp x26,x25,[sp, #0x10]
00aaf0dc	stp x24,x23,[sp, #0x20]
00aaf0e0	stp x22,x21,[sp, #0x30]
00aaf0e4	stp x29,x30,[sp, #0x50]
00aaf0e8	add x29,sp,#0x50
00aaf0ec	cbz w2,0x00aaf16c
00aaf0f0	mov w23,w5
00aaf0f4	mov x19,x4
00aaf0f8	mov w24,w2
00aaf0fc	mov x21,x1
00aaf100	mov x22,x0
00aaf104	cmp w2,#0x1
00aaf108	b.lt 0x00aaf174
00aaf10c	mov w27,wzr
00aaf110	add w8,w24,w27
00aaf114	cmp w8,#0x0
00aaf118	cinc w8,w8,lt
00aaf11c	asr w26,w8,#0x1
00aaf120	mul w8,w26,w20
00aaf124	add x25,x21,w8, SXTW 
00aaf128	mov x0,x22
00aaf12c	mov x1,x25
00aaf130	blr x19
00aaf134	mov w8,w26
00aaf138	tbnz w0,#0x1f,0x00aaf148
00aaf13c	cbz w0,0x00aaf1d4
00aaf140	add w27,w26,#0x1
00aaf144	mov w8,w24
00aaf148	cmp w27,w8
00aaf14c	mov w24,w8
00aaf150	b.lt 0x00aaf110
00aaf154	mov x0,xzr
00aaf158	tbz w23,#0x0,0x00aaf1e0
00aaf15c	mov w8,#0x1
00aaf160	mov x0,x25
00aaf164	tbnz w23,#0x1,0x00aaf184
00aaf168	b 0x00aaf1e0
00aaf16c	mov x0,xzr
00aaf170	b 0x00aaf1e0
00aaf174	mov w8,wzr
00aaf178	mov x0,xzr
00aaf17c	mov w26,wzr
00aaf180	tbz w23,#0x1,0x00aaf1e0
00aaf184	tbnz w8,#0x0,0x00aaf1e0
00aaf188	sxtw x8,w26
00aaf18c	sxtw x9,w20
00aaf190	add x23,x8,#0x1
00aaf194	sub x8,x8,#0x1
00aaf198	mul w24,w26,w20
00aaf19c	madd x1,x8,x9,x21
00aaf1a0	neg x25,x9
00aaf1a4	sub x23,x23,#0x1
00aaf1a8	cmp x23,#0x1
00aaf1ac	mov w26,w24
00aaf1b0	b.lt 0x00aaf1cc
00aaf1b4	mov x0,x22
00aaf1b8	sub w24,w26,w20
00aaf1bc	add x27,x1,x25
00aaf1c0	blr x19
00aaf1c4	mov x1,x27
00aaf1c8	cbz w0,0x00aaf1a4
00aaf1cc	add x0,x21,w26, SXTW 
00aaf1d0	b 0x00aaf1e0
00aaf1d4	mov w8,wzr
00aaf1d8	mov x0,x25
00aaf1dc	tbnz w23,#0x1,0x00aaf184
00aaf1e0	ldp x29,x30,[sp, #0x50]
00aaf1e4	ldp x20,x19,[sp, #0x40]
00aaf1e8	ldp x22,x21,[sp, #0x30]
00aaf1ec	ldp x24,x23,[sp, #0x20]
00aaf1f0	ldp x26,x25,[sp, #0x10]
00aaf1f4	ldr x27,[sp], #0x60
00aaf1f8	ret
