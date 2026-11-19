; ssl_srp_server_param_with_username_intern @ 009c85d4
009c85d4	sub sp,sp,#0x50
009c85d8	mov w8,#0x73
009c85dc	stp x20,x19,[sp, #0x30]
009c85e0	stp x29,x30,[sp, #0x40]
009c85e4	str w8,[x1]
009c85e8	ldr x8,[x0, #0xbd8]
009c85ec	mov x20,x1
009c85f0	mov x19,x0
009c85f4	add x29,sp,#0x40
009c85f8	cbz x8,0x009c8610
009c85fc	ldr x2,[x19, #0xbd0]
009c8600	mov x0,x19
009c8604	mov x1,x20
009c8608	blr x8
009c860c	cbnz w0,0x009c86b0
009c8610	mov w8,#0x50
009c8614	str w8,[x20]
009c8618	ldr x8,[x19, #0xbf8]
009c861c	cbz x8,0x009c86ac
009c8620	ldr x8,[x19, #0xc00]
009c8624	cbz x8,0x009c86ac
009c8628	ldr x8,[x19, #0xc08]
009c862c	cbz x8,0x009c86ac
009c8630	ldr x8,[x19, #0xc30]
009c8634	cbz x8,0x009c86ac
009c8638	ldr x8,[x19, #0x9a8]
009c863c	mov x1,sp
009c8640	orr w2,wzr,#0x30
009c8644	mov w3,wzr
009c8648	ldr x0,[x8]
009c864c	bl 0x00c358b0
009c8650	cmp w0,#0x1
009c8654	b.lt 0x009c86ac
009c8658	mov x0,sp
009c865c	orr w1,wzr,#0x30
009c8660	mov x2,xzr
009c8664	bl 0x00c36970
009c8668	str x0,[x19, #0xc28]
009c866c	mov x0,sp
009c8670	orr w1,wzr,#0x30
009c8674	bl 0x00c34750
009c8678	ldr x8,[x19, #0x9a8]
009c867c	ldr x0,[x19, #0xc28]
009c8680	ldr x1,[x19, #0xbf8]
009c8684	ldr x2,[x19, #0xc00]
009c8688	ldr x3,[x19, #0xc30]
009c868c	ldr x4,[x8]
009c8690	ldr x5,[x8, #0x440]
009c8694	bl 0x00c369e0
009c8698	cmp x0,#0x0
009c869c	cset w8,eq
009c86a0	str x0,[x19, #0xc10]
009c86a4	lsl w0,w8,#0x1
009c86a8	b 0x009c86b0
009c86ac	mov w0,#0x2
009c86b0	ldp x29,x30,[sp, #0x40]
009c86b4	ldp x20,x19,[sp, #0x30]
009c86b8	add sp,sp,#0x50
009c86bc	ret
