; EVP_CIPHER_get_asn1_iv @ 00a5e834
00a5e834	sub sp,sp,#0x40
00a5e838	str x21,[sp, #0x10]
00a5e83c	stp x20,x19,[sp, #0x20]
00a5e840	stp x29,x30,[sp, #0x30]
00a5e844	add x29,sp,#0x30
00a5e848	cbz x1,0x00a5e8a4
00a5e84c	mov x21,x1
00a5e850	mov x20,x0
00a5e854	bl 0x00a5e8c0
00a5e858	cmp w0,#0x10
00a5e85c	b.hi 0x00a5e89c
00a5e860	mov w19,w0
00a5e864	mov x1,sp
00a5e868	mov x0,x21
00a5e86c	mov w2,w19
00a5e870	bl 0x00c37d80
00a5e874	cmp w0,w19
00a5e878	b.ne 0x00a5e89c
00a5e87c	mov x4,sp
00a5e880	mov w5,#0xffffffff
00a5e884	mov x0,x20
00a5e888	mov x1,xzr
00a5e88c	mov x2,xzr
00a5e890	mov x3,xzr
00a5e894	bl 0x00c34be0
00a5e898	cbnz w0,0x00a5e8a8
00a5e89c	mov w19,#0xffffffff
00a5e8a0	b 0x00a5e8a8
00a5e8a4	mov w19,wzr
00a5e8a8	mov w0,w19
00a5e8ac	ldp x29,x30,[sp, #0x30]
00a5e8b0	ldp x20,x19,[sp, #0x20]
00a5e8b4	ldr x21,[sp, #0x10]
00a5e8b8	add sp,sp,#0x40
00a5e8bc	ret
