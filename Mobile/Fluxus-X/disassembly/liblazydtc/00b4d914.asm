; FUN_00b4d914 @ 00b4d914
00b4d914	stp x22,x21,[sp, #-0x30]!
00b4d918	stp x20,x19,[sp, #0x10]
00b4d91c	stp x29,x30,[sp, #0x20]
00b4d920	add x29,sp,#0x20
00b4d924	mov w21,w2
00b4d928	mov x19,x1
00b4d92c	mov x20,x0
00b4d930	bl 0x00c41000
00b4d934	cbz w0,0x00b4d95c
00b4d938	tst w21,#0x3
00b4d93c	b.eq 0x00b4d964
00b4d940	tbnz w21,#0x1,0x00b4d970
00b4d944	tbnz w21,#0x0,0x00b4d994
00b4d948	mov w9,wzr
00b4d94c	mov w8,#0x1
00b4d950	and w22,w9,w8
00b4d954	tbnz w21,#0x2,0x00b4d9d8
00b4d958	b 0x00b4da08
00b4d95c	mov w22,wzr
00b4d960	b 0x00b4da08
00b4d964	mov w22,#0x1
00b4d968	tbnz w21,#0x2,0x00b4d9d8
00b4d96c	b 0x00b4da08
00b4d970	mov x0,x20
00b4d974	bl 0x00c3a0e0
00b4d978	mov x22,x0
00b4d97c	mov x0,x19
00b4d980	bl 0x00c3a0e0
00b4d984	cbz x22,0x00b4d944
00b4d988	mov x1,x0
00b4d98c	cbnz x0,0x00b4d9bc
00b4d990	b 0x00b4d944
00b4d994	mov x0,x20
00b4d998	bl 0x00c3a0d0
00b4d99c	mov x22,x0
00b4d9a0	mov x0,x19
00b4d9a4	bl 0x00c3a0d0
00b4d9a8	mov w8,#0x1
00b4d9ac	cbz x22,0x00b4da1c
00b4d9b0	mov x1,x0
00b4d9b4	mov w9,wzr
00b4d9b8	cbz x0,0x00b4d9d0
00b4d9bc	mov x0,x22
00b4d9c0	bl 0x00c38cc0
00b4d9c4	cmp w0,#0x0
00b4d9c8	cset w8,eq
00b4d9cc	mov w9,#0x1
00b4d9d0	and w22,w9,w8
00b4d9d4	tbz w21,#0x2,0x00b4da08
00b4d9d8	mov x0,x20
00b4d9dc	bl 0x00c3a330
00b4d9e0	mov x20,x0
00b4d9e4	mov x0,x19
00b4d9e8	bl 0x00c3a330
00b4d9ec	cbz w22,0x00b4da08
00b4d9f0	mov x1,x0
00b4d9f4	mov w2,#0x1
00b4d9f8	mov x0,x20
00b4d9fc	bl 0x00c39c70
00b4da00	cmp w0,#0x0
00b4da04	cset w22,ne
00b4da08	ldp x29,x30,[sp, #0x20]
00b4da0c	ldp x20,x19,[sp, #0x10]
00b4da10	mov w0,w22
00b4da14	ldp x22,x21,[sp], #0x30
00b4da18	ret
00b4da1c	mov w9,wzr
00b4da20	and w22,w9,w8
00b4da24	tbnz w21,#0x2,0x00b4d9d8
00b4da28	b 0x00b4da08
