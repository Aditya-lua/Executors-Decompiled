; EVP_PKEY_get_octet_string_param @ 00a6ecfc
00a6ecfc	cbz x1,0x00a6ed9c
00a6ed00	sub sp,sp,#0xa0
00a6ed04	stp x20,x19,[sp, #0x80]
00a6ed08	mov x20,x0
00a6ed0c	add x8,sp,#0x8
00a6ed10	mov x0,x1
00a6ed14	mov x1,x2
00a6ed18	mov x2,x3
00a6ed1c	stp x29,x30,[sp, #0x90]
00a6ed20	add x29,sp,#0x90
00a6ed24	mov x19,x4
00a6ed28	bl 0x00c34c50
00a6ed2c	ldr x8,[sp, #0x28]
00a6ed30	ldur q0,[sp, #0x18]
00a6ed34	ldur q1,[sp, #0x8]
00a6ed38	str x8,[sp, #0x50]
00a6ed3c	add x8,sp,#0x8
00a6ed40	stp q1,q0,[sp, #0x30]
00a6ed44	bl 0x00c34c40
00a6ed48	ldr x8,[sp, #0x28]
00a6ed4c	ldur q0,[sp, #0x18]
00a6ed50	ldur q1,[sp, #0x8]
00a6ed54	add x1,sp,#0x30
00a6ed58	mov x0,x20
00a6ed5c	str x8,[sp, #0x78]
00a6ed60	stur q0,[sp, #0x68]
00a6ed64	stur q1,[sp, #0x58]
00a6ed68	bl 0x00a6f360
00a6ed6c	mov w20,w0
00a6ed70	cbz w0,0x00a6eda4
00a6ed74	add x0,sp,#0x30
00a6ed78	bl 0x00c3d030
00a6ed7c	cmp w0,#0x0
00a6ed80	cset w8,ne
00a6ed84	cbz x19,0x00a6eda8
00a6ed88	cbz w0,0x00a6eda8
00a6ed8c	ldr x8,[sp, #0x50]
00a6ed90	str x8,[x19]
00a6ed94	mov w8,#0x1
00a6ed98	b 0x00a6eda8
00a6ed9c	mov w0,wzr
00a6eda0	ret
00a6eda4	mov w8,wzr
00a6eda8	cmp w20,#0x0
00a6edac	ldp x29,x30,[sp, #0x90]
00a6edb0	ldp x20,x19,[sp, #0x80]
00a6edb4	cset w9,ne
00a6edb8	and w0,w9,w8
00a6edbc	add sp,sp,#0xa0
00a6edc0	ret
