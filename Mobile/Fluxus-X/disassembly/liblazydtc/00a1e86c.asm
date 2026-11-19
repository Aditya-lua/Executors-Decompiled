; ossl_dh_buf2key @ 00a1e86c
00a1e86c	sub sp,sp,#0x30
00a1e870	stp x20,x19,[sp, #0x10]
00a1e874	mov x20,x0
00a1e878	mov x0,x1
00a1e87c	mov w1,w2
00a1e880	mov x2,xzr
00a1e884	stp x29,x30,[sp, #0x20]
00a1e888	add x29,sp,#0x20
00a1e88c	bl 0x00c36970
00a1e890	mov x19,x0
00a1e894	cbz x0,0x00a1e8f8
00a1e898	add x1,sp,#0x8
00a1e89c	mov x0,x20
00a1e8a0	mov x2,xzr
00a1e8a4	mov x3,xzr
00a1e8a8	bl 0x00c39fa0
00a1e8ac	ldr x0,[sp, #0x8]
00a1e8b0	cbz x0,0x00a1e8c4
00a1e8b4	bl 0x00c322f0
00a1e8b8	add w8,w0,#0xe
00a1e8bc	cmp w8,#0xf
00a1e8c0	b.cs 0x00a1e8cc
00a1e8c4	mov w20,#0x6b
00a1e8c8	b 0x00a1e8fc
00a1e8cc	add x2,sp,#0x4
00a1e8d0	mov x0,x20
00a1e8d4	mov x1,x19
00a1e8d8	bl 0x00c39e40
00a1e8dc	cbz w0,0x00a1e944
00a1e8e0	mov x0,x20
00a1e8e4	mov x1,x19
00a1e8e8	mov x2,xzr
00a1e8ec	bl 0x00c39d30
00a1e8f0	cmp w0,#0x1
00a1e8f4	b.eq 0x00a1e934
00a1e8f8	mov w20,#0x6a
00a1e8fc	bl 0x00c342a0
00a1e900	adrp x0,0x2bf000
00a1e904	adrp x2,0x2b7000
00a1e908	add x0,x0,#0xb05
00a1e90c	add x2,x2,#0x99f
00a1e910	mov w1,#0x197
00a1e914	bl 0x00c342b0
00a1e918	mov w0,#0x5
00a1e91c	mov w1,w20
00a1e920	mov x2,xzr
00a1e924	bl 0x00c342c0
00a1e928	mov x0,x19
00a1e92c	bl 0x00c36290
00a1e930	mov w0,wzr
00a1e934	ldp x29,x30,[sp, #0x20]
00a1e938	ldp x20,x19,[sp, #0x10]
00a1e93c	add sp,sp,#0x30
00a1e940	ret
00a1e944	mov w20,#0x66
00a1e948	b 0x00a1e8fc
