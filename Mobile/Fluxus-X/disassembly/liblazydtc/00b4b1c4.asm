; ossl_DER_w_precompiled @ 00b4b1c4
00b4b1c4	sub sp,sp,#0x40
00b4b1c8	stp x22,x21,[sp, #0x10]
00b4b1cc	stp x20,x19,[sp, #0x20]
00b4b1d0	mov x21,x3
00b4b1d4	mov x22,x2
00b4b1d8	mov w20,w1
00b4b1dc	mov x19,x0
00b4b1e0	stp x29,x30,[sp, #0x30]
00b4b1e4	add x29,sp,#0x30
00b4b1e8	tbnz w1,#0x1f,0x00b4b204
00b4b1ec	cmp w20,#0x1e
00b4b1f0	mov w0,wzr
00b4b1f4	b.gt 0x00b4b258
00b4b1f8	mov x0,x19
00b4b1fc	bl 0x00c37240
00b4b200	cbz w0,0x00b4b258
00b4b204	mov x0,x19
00b4b208	mov x1,x22
00b4b20c	mov x2,x21
00b4b210	bl 0x00c34390
00b4b214	cbz w0,0x00b4b258
00b4b218	tbnz w20,#0x1f,0x00b4b254
00b4b21c	add x1,sp,#0x8
00b4b220	mov x0,x19
00b4b224	bl 0x00c34370
00b4b228	cbz w0,0x00b4b258
00b4b22c	mov x0,x19
00b4b230	bl 0x00c34350
00b4b234	cbz w0,0x00b4b258
00b4b238	mov x1,sp
00b4b23c	mov x0,x19
00b4b240	bl 0x00c34370
00b4b244	cbz w0,0x00b4b258
00b4b248	ldp x9,x8,[sp]
00b4b24c	cmp x8,x9
00b4b250	b.ne 0x00b4b26c
00b4b254	mov w0,#0x1
00b4b258	ldp x29,x30,[sp, #0x30]
00b4b25c	ldp x20,x19,[sp, #0x20]
00b4b260	ldp x22,x21,[sp, #0x10]
00b4b264	add sp,sp,#0x40
00b4b268	ret
00b4b26c	mov w8,#0xa0
00b4b270	orr w8,w20,w8
00b4b274	sxtw x1,w8
00b4b278	mov w2,#0x1
00b4b27c	mov x0,x19
00b4b280	bl 0x00c343a0
00b4b284	cmp w0,#0x0
00b4b288	cset w0,ne
00b4b28c	b 0x00b4b258
