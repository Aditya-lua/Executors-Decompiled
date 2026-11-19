; EVP_PKEY_get_utf8_string_param @ 00a6e8a8
00a6e8a8	sub sp,sp,#0xb0
00a6e8ac	stp x22,x21,[sp, #0x80]
00a6e8b0	stp x20,x19,[sp, #0x90]
00a6e8b4	stp x29,x30,[sp, #0xa0]
00a6e8b8	add x29,sp,#0xa0
00a6e8bc	cbz x1,0x00a6e948
00a6e8c0	mov x19,x2
00a6e8c4	mov x21,x0
00a6e8c8	add x8,sp,#0x8
00a6e8cc	mov x0,x1
00a6e8d0	mov x1,x2
00a6e8d4	mov x2,x3
00a6e8d8	mov x22,x4
00a6e8dc	mov x20,x3
00a6e8e0	bl 0x00c36280
00a6e8e4	ldr x8,[sp, #0x28]
00a6e8e8	ldur q0,[sp, #0x18]
00a6e8ec	ldur q1,[sp, #0x8]
00a6e8f0	str x8,[sp, #0x50]
00a6e8f4	add x8,sp,#0x8
00a6e8f8	stp q1,q0,[sp, #0x30]
00a6e8fc	bl 0x00c34c40
00a6e900	ldr x8,[sp, #0x28]
00a6e904	ldur q0,[sp, #0x18]
00a6e908	ldur q1,[sp, #0x8]
00a6e90c	add x1,sp,#0x30
00a6e910	mov x0,x21
00a6e914	str x8,[sp, #0x78]
00a6e918	stur q0,[sp, #0x68]
00a6e91c	stur q1,[sp, #0x58]
00a6e920	bl 0x00a6f360
00a6e924	mov w21,w0
00a6e928	cbz w0,0x00a6e974
00a6e92c	add x0,sp,#0x30
00a6e930	bl 0x00c3d030
00a6e934	cbz x22,0x00a6e950
00a6e938	cbz w0,0x00a6e950
00a6e93c	ldr x8,[sp, #0x50]
00a6e940	str x8,[x22]
00a6e944	b 0x00a6e958
00a6e948	mov w0,wzr
00a6e94c	b 0x00a6e984
00a6e950	cbz w0,0x00a6e974
00a6e954	ldr x8,[sp, #0x50]
00a6e958	cmp x8,x20
00a6e95c	mov w0,wzr
00a6e960	b.eq 0x00a6e984
00a6e964	cbz x19,0x00a6e96c
00a6e968	strb wzr,[x19, x8]
00a6e96c	mov w8,#0x1
00a6e970	b 0x00a6e978
00a6e974	mov w8,wzr
00a6e978	cmp w21,#0x0
00a6e97c	cset w9,ne
00a6e980	and w0,w9,w8
00a6e984	ldp x29,x30,[sp, #0xa0]
00a6e988	ldp x20,x19,[sp, #0x90]
00a6e98c	ldp x22,x21,[sp, #0x80]
00a6e990	add sp,sp,#0xb0
00a6e994	ret
