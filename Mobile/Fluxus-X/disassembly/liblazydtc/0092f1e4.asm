; curl_multi_get_handles @ 0092f1e4
0092f1e4	str x19,[sp, #-0x20]!
0092f1e8	stp x29,x30,[sp, #0x10]
0092f1ec	add x29,sp,#0x10
0092f1f0	adrp x9,0xcb4000
0092f1f4	ldr w8,[x0, #0x18]
0092f1f8	ldr x9,[x9, #0xde0]
0092f1fc	mov x19,x0
0092f200	add w8,w8,#0x1
0092f204	ldr x9,[x9]
0092f208	lsl x0,x8,#0x3
0092f20c	blr x9
0092f210	cbz x0,0x0092f24c
0092f214	ldr x9,[x19, #0x8]
0092f218	cbz x9,0x0092f244
0092f21c	mov w8,wzr
0092f220	mov w10,#0x131e
0092f224	ldrb w11,[x9, x10]
0092f228	tbnz w11,#0x2,0x0092f238
0092f22c	add w11,w8,#0x1
0092f230	str x9,[x0, w8, UXTW #0x3]
0092f234	mov w8,w11
0092f238	ldr x9,[x9, #0x10]
0092f23c	cbnz x9,0x0092f224
0092f240	b 0x0092f248
0092f244	mov w8,wzr
0092f248	str xzr,[x0, w8, UXTW #0x3]
0092f24c	ldp x29,x30,[sp, #0x10]
0092f250	ldr x19,[sp], #0x20
0092f254	ret
