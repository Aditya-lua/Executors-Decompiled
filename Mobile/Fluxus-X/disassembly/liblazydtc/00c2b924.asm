; _INIT_0 @ 00c2b924
00c2b924	paciasp
00c2b928	sub sp,sp,#0x70
00c2b92c	str x30,[sp, #0x60]
00c2b930	mov w0,#0x10
00c2b934	bl 0x00c3ed70
00c2b938	tbnz w0,#0x8,0x00c2b954
00c2b93c	adrp x9,0xd28000
00c2b940	ldr x30,[sp, #0x60]
00c2b944	strb wzr,[x9, #0xe0]
00c2b948	add sp,sp,#0x70
00c2b94c	autiasp
00c2b950	ret
00c2b954	adrp x0,0x2ab000
00c2b958	add x0,x0,#0x2fd
00c2b95c	add x1,sp,#0x4
00c2b960	bl 0x00c43960
00c2b964	cmp w0,#0x1
00c2b968	b.lt 0x00c2b9a0
00c2b96c	adrp x1,0x2b1000
00c2b970	add x1,x1,#0x1f9
00c2b974	add x0,sp,#0x4
00c2b978	mov w2,#0xa
00c2b97c	bl 0x00c31bb0
00c2b980	cmp w0,#0x0
00c2b984	cset w8,ne
00c2b988	adrp x9,0xd28000
00c2b98c	ldr x30,[sp, #0x60]
00c2b990	strb w8,[x9, #0xe0]
00c2b994	add sp,sp,#0x70
00c2b998	autiasp
00c2b99c	ret
00c2b9a0	mov w8,#0x1
00c2b9a4	adrp x9,0xd28000
00c2b9a8	ldr x30,[sp, #0x60]
00c2b9ac	strb w8,[x9, #0xe0]
00c2b9b0	add sp,sp,#0x70
00c2b9b4	autiasp
00c2b9b8	ret
