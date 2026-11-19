; FUN_00ac95f4 @ 00ac95f4
00ac95f4	stp x20,x19,[sp, #-0x20]!
00ac95f8	stp x29,x30,[sp, #0x10]
00ac95fc	add x29,sp,#0x10
00ac9600	cbz x0,0x00ac9630
00ac9604	mov x19,x0
00ac9608	add x9,x0,#0x20
00ac960c	ldxr w8,[x9]
00ac9610	subs w10,w8,#0x1
00ac9614	stxr w11,w10,[x9]
00ac9618	cbnz w11,0x00ac960c
00ac961c	b.ne 0x00ac9628
00ac9620	dmb ISHLD
00ac9624	b 0x00ac963c
00ac9628	cmp w8,#0x1
00ac962c	b.le 0x00ac963c
00ac9630	ldp x29,x30,[sp, #0x10]
00ac9634	ldp x20,x19,[sp], #0x20
00ac9638	ret
00ac963c	ldr x0,[x19, #0x10]
00ac9640	adrp x20,0x2ce000
00ac9644	add x20,x20,#0x291
00ac9648	mov w2,#0x48
00ac964c	mov x1,x20
00ac9650	bl 0x00c32310
00ac9654	ldr x0,[x19]
00ac9658	bl 0x00c3b690
00ac965c	ldr x0,[x19, #0x28]
00ac9660	bl 0x00c34d40
00ac9664	ldp x29,x30,[sp, #0x10]
00ac9668	mov w2,#0x4b
00ac966c	mov x0,x19
00ac9670	mov x1,x20
00ac9674	ldp x20,x19,[sp], #0x20
00ac9678	b 0x00c32310
