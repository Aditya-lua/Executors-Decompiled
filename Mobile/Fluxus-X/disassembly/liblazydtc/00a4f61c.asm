; FUN_00a4f61c @ 00a4f61c
00a4f61c	stp x20,x19,[sp, #-0x20]!
00a4f620	stp x29,x30,[sp, #0x10]
00a4f624	add x29,sp,#0x10
00a4f628	cbz x0,0x00a4f658
00a4f62c	mov x19,x0
00a4f630	add x9,x0,#0x28
00a4f634	ldxr w8,[x9]
00a4f638	subs w10,w8,#0x1
00a4f63c	stxr w11,w10,[x9]
00a4f640	cbnz w11,0x00a4f634
00a4f644	b.ne 0x00a4f650
00a4f648	dmb ISHLD
00a4f64c	b 0x00a4f664
00a4f650	cmp w8,#0x1
00a4f654	b.le 0x00a4f664
00a4f658	ldp x29,x30,[sp, #0x10]
00a4f65c	ldp x20,x19,[sp], #0x20
00a4f660	ret
00a4f664	ldr x0,[x19, #0x10]
00a4f668	adrp x20,0x2db000
00a4f66c	add x20,x20,#0xf32
00a4f670	mov w2,#0x3d
00a4f674	mov x1,x20
00a4f678	bl 0x00c32310
00a4f67c	ldr x0,[x19, #0x20]
00a4f680	bl 0x00c3b670
00a4f684	ldr x0,[x19]
00a4f688	bl 0x00c3b690
00a4f68c	ldr x0,[x19, #0x30]
00a4f690	bl 0x00c34d40
00a4f694	ldp x29,x30,[sp, #0x10]
00a4f698	mov w2,#0x41
00a4f69c	mov x0,x19
00a4f6a0	mov x1,x20
00a4f6a4	ldp x20,x19,[sp], #0x20
00a4f6a8	b 0x00c32310
