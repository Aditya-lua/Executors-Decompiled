; FUN_00b4c6a8 @ 00b4c6a8
00b4c6a8	stp x22,x21,[sp, #-0x30]!
00b4c6ac	stp x20,x19,[sp, #0x10]
00b4c6b0	stp x29,x30,[sp, #0x20]
00b4c6b4	add x29,sp,#0x20
00b4c6b8	mov w21,w2
00b4c6bc	mov x19,x1
00b4c6c0	mov x20,x0
00b4c6c4	bl 0x00c41000
00b4c6c8	cbz w0,0x00b4c6f0
00b4c6cc	tst w21,#0x3
00b4c6d0	b.eq 0x00b4c6f8
00b4c6d4	tbnz w21,#0x1,0x00b4c704
00b4c6d8	tbnz w21,#0x0,0x00b4c728
00b4c6dc	mov w9,wzr
00b4c6e0	mov w8,#0x1
00b4c6e4	and w22,w9,w8
00b4c6e8	tbnz w21,#0x2,0x00b4c76c
00b4c6ec	b 0x00b4c79c
00b4c6f0	mov w22,wzr
00b4c6f4	b 0x00b4c79c
00b4c6f8	mov w22,#0x1
00b4c6fc	tbnz w21,#0x2,0x00b4c76c
00b4c700	b 0x00b4c79c
00b4c704	mov x0,x20
00b4c708	bl 0x00c39af0
00b4c70c	mov x22,x0
00b4c710	mov x0,x19
00b4c714	bl 0x00c39af0
00b4c718	cbz x22,0x00b4c6d8
00b4c71c	mov x1,x0
00b4c720	cbnz x0,0x00b4c750
00b4c724	b 0x00b4c6d8
00b4c728	mov x0,x20
00b4c72c	bl 0x00c39ae0
00b4c730	mov x22,x0
00b4c734	mov x0,x19
00b4c738	bl 0x00c39ae0
00b4c73c	mov w8,#0x1
00b4c740	cbz x22,0x00b4c7b0
00b4c744	mov x1,x0
00b4c748	mov w9,wzr
00b4c74c	cbz x0,0x00b4c764
00b4c750	mov x0,x22
00b4c754	bl 0x00c38cc0
00b4c758	cmp w0,#0x0
00b4c75c	cset w8,eq
00b4c760	mov w9,#0x1
00b4c764	and w22,w9,w8
00b4c768	tbz w21,#0x2,0x00b4c79c
00b4c76c	mov x0,x20
00b4c770	bl 0x00c39d70
00b4c774	mov x20,x0
00b4c778	mov x0,x19
00b4c77c	bl 0x00c39d70
00b4c780	cbz w22,0x00b4c79c
00b4c784	mov x1,x0
00b4c788	mov w2,#0x1
00b4c78c	mov x0,x20
00b4c790	bl 0x00c39c70
00b4c794	cmp w0,#0x0
00b4c798	cset w22,ne
00b4c79c	ldp x29,x30,[sp, #0x20]
00b4c7a0	ldp x20,x19,[sp, #0x10]
00b4c7a4	mov w0,w22
00b4c7a8	ldp x22,x21,[sp], #0x30
00b4c7ac	ret
00b4c7b0	mov w9,wzr
00b4c7b4	and w22,w9,w8
00b4c7b8	tbnz w21,#0x2,0x00b4c76c
00b4c7bc	b 0x00b4c79c
