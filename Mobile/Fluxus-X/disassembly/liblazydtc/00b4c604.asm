; FUN_00b4c604 @ 00b4c604
00b4c604	stp x20,x19,[sp, #-0x20]!
00b4c608	stp x29,x30,[sp, #0x10]
00b4c60c	add x29,sp,#0x10
00b4c610	mov w20,w1
00b4c614	mov x19,x0
00b4c618	bl 0x00c41000
00b4c61c	mov w8,w0
00b4c620	mov w0,wzr
00b4c624	cbz x19,0x00b4c69c
00b4c628	cbz w8,0x00b4c69c
00b4c62c	tst w20,#0x7
00b4c630	b.eq 0x00b4c65c
00b4c634	tbnz w20,#0x1,0x00b4c664
00b4c638	mov w0,#0x1
00b4c63c	tbz w20,#0x0,0x00b4c678
00b4c640	cbz w0,0x00b4c678
00b4c644	mov x0,x19
00b4c648	bl 0x00c39ae0
00b4c64c	cmp x0,#0x0
00b4c650	cset w0,ne
00b4c654	tbnz w20,#0x2,0x00b4c67c
00b4c658	b 0x00b4c69c
00b4c65c	mov w0,#0x1
00b4c660	b 0x00b4c69c
00b4c664	mov x0,x19
00b4c668	bl 0x00c39af0
00b4c66c	cmp x0,#0x0
00b4c670	cset w0,ne
00b4c674	tbnz w20,#0x0,0x00b4c640
00b4c678	tbz w20,#0x2,0x00b4c69c
00b4c67c	cbz w0,0x00b4c69c
00b4c680	mov x0,x19
00b4c684	bl 0x00c39ad0
00b4c688	cbz x0,0x00b4c69c
00b4c68c	mov x0,x19
00b4c690	bl 0x00c39ac0
00b4c694	cmp x0,#0x0
00b4c698	cset w0,ne
00b4c69c	ldp x29,x30,[sp, #0x10]
00b4c6a0	ldp x20,x19,[sp], #0x20
00b4c6a4	ret
