; FUN_00afbff8 @ 00afbff8
00afbff8	stp x20,x19,[sp, #-0x20]!
00afbffc	mov w8,w3
00afc000	mov x20,x1
00afc004	adrp x1,0x2bb000
00afc008	adrp x3,0x2ab000
00afc00c	mov x19,x2
00afc010	add x1,x1,#0x9d8
00afc014	add x3,x3,#0x32c
00afc018	mov x0,x2
00afc01c	mov w2,w8
00afc020	stp x29,x30,[sp, #0x10]
00afc024	add x29,sp,#0x10
00afc028	bl 0x00c32250
00afc02c	cmp w0,#0x1
00afc030	b.lt 0x00afc050
00afc034	mov w2,#0x4
00afc038	mov x0,x19
00afc03c	mov x1,x20
00afc040	bl 0x00c37de0
00afc044	cmp w0,#0x0
00afc048	cset w0,gt
00afc04c	b 0x00afc054
00afc050	mov w0,wzr
00afc054	ldp x29,x30,[sp, #0x10]
00afc058	ldp x20,x19,[sp], #0x20
00afc05c	ret
