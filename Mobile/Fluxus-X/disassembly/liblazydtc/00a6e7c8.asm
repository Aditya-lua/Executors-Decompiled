; EVP_PKEY_get_group_name @ 00a6e7c8
00a6e7c8	sub sp,sp,#0xb0
00a6e7cc	stp x22,x21,[sp, #0x80]
00a6e7d0	mov x21,x0
00a6e7d4	adrp x0,0x2a2000
00a6e7d8	add x0,x0,#0x238
00a6e7dc	add x8,sp,#0x8
00a6e7e0	stp x20,x19,[sp, #0x90]
00a6e7e4	stp x29,x30,[sp, #0xa0]
00a6e7e8	add x29,sp,#0xa0
00a6e7ec	mov x22,x3
00a6e7f0	mov x20,x2
00a6e7f4	mov x19,x1
00a6e7f8	bl 0x00c36280
00a6e7fc	ldr x8,[sp, #0x28]
00a6e800	ldur q0,[sp, #0x18]
00a6e804	ldur q1,[sp, #0x8]
00a6e808	str x8,[sp, #0x50]
00a6e80c	add x8,sp,#0x8
00a6e810	stp q1,q0,[sp, #0x30]
00a6e814	bl 0x00c34c40
00a6e818	ldr x8,[sp, #0x28]
00a6e81c	ldur q0,[sp, #0x18]
00a6e820	ldur q1,[sp, #0x8]
00a6e824	add x1,sp,#0x30
00a6e828	mov x0,x21
00a6e82c	str x8,[sp, #0x78]
00a6e830	stur q0,[sp, #0x68]
00a6e834	stur q1,[sp, #0x58]
00a6e838	bl 0x00a6f360
00a6e83c	mov w21,w0
00a6e840	cbz w0,0x00a6e884
00a6e844	add x0,sp,#0x30
00a6e848	bl 0x00c3d030
00a6e84c	cbz x22,0x00a6e860
00a6e850	cbz w0,0x00a6e860
00a6e854	ldr x8,[sp, #0x50]
00a6e858	str x8,[x22]
00a6e85c	b 0x00a6e868
00a6e860	cbz w0,0x00a6e884
00a6e864	ldr x8,[sp, #0x50]
00a6e868	cmp x8,x20
00a6e86c	mov w0,wzr
00a6e870	b.eq 0x00a6e894
00a6e874	cbz x19,0x00a6e87c
00a6e878	strb wzr,[x19, x8]
00a6e87c	mov w8,#0x1
00a6e880	b 0x00a6e888
00a6e884	mov w8,wzr
00a6e888	cmp w21,#0x0
00a6e88c	cset w9,ne
00a6e890	and w0,w9,w8
00a6e894	ldp x29,x30,[sp, #0xa0]
00a6e898	ldp x20,x19,[sp, #0x90]
00a6e89c	ldp x22,x21,[sp, #0x80]
00a6e8a0	add sp,sp,#0xb0
00a6e8a4	ret
