; std::__ndk1::ctype_byname<wchar_t>::do_is @ 00bfd67c
00bfd67c	paciasp
00bfd680	stp x29,x30,[sp, #-0x30]!
00bfd684	stp x22,x21,[sp, #0x10]
00bfd688	stp x20,x19,[sp, #0x20]
00bfd68c	mov x29,sp
00bfd690	mov w19,w2
00bfd694	mov x22,x1
00bfd698	mov x21,x0
00bfd69c	tbnz w22,#0x0,0x00bfd6ac
00bfd6a0	mov w20,wzr
00bfd6a4	tbnz w22,#0x1,0x00bfd6c4
00bfd6a8	b 0x00bfd6d8
00bfd6ac	ldr x1,[x21, #0x10]
00bfd6b0	mov w0,w19
00bfd6b4	bl 0x00c43a90
00bfd6b8	cmp w0,#0x0
00bfd6bc	cset w20,ne
00bfd6c0	tbz w22,#0x1,0x00bfd6d8
00bfd6c4	ldr x1,[x21, #0x10]
00bfd6c8	mov w0,w19
00bfd6cc	bl 0x00c43ab0
00bfd6d0	cmp w0,#0x0
00bfd6d4	csinc w20,w20,wzr,eq
00bfd6d8	tbnz w22,#0x2,0x00bfd724
00bfd6dc	tbnz w22,#0x3,0x00bfd73c
00bfd6e0	tbnz w22,#0x4,0x00bfd754
00bfd6e4	tbnz w22,#0x5,0x00bfd76c
00bfd6e8	tbnz w22,#0x6,0x00bfd784
00bfd6ec	tbnz w22,#0x7,0x00bfd79c
00bfd6f0	tbnz w22,#0x8,0x00bfd7b4
00bfd6f4	tbz w22,#0x9,0x00bfd70c
00bfd6f8	ldr x1,[x21, #0x10]
00bfd6fc	mov w0,w19
00bfd700	bl 0x00c43a10
00bfd704	cmp w0,#0x0
00bfd708	csinc w20,w20,wzr,eq
00bfd70c	mov w0,w20
00bfd710	ldp x20,x19,[sp, #0x20]
00bfd714	ldp x22,x21,[sp, #0x10]
00bfd718	ldp x29,x30,[sp], #0x30
00bfd71c	autiasp
00bfd720	ret
00bfd724	ldr x1,[x21, #0x10]
00bfd728	mov w0,w19
00bfd72c	bl 0x00c43860
00bfd730	cmp w0,#0x0
00bfd734	csinc w20,w20,wzr,eq
00bfd738	tbz w22,#0x3,0x00bfd6e0
00bfd73c	ldr x1,[x21, #0x10]
00bfd740	mov w0,w19
00bfd744	bl 0x00c43a00
00bfd748	cmp w0,#0x0
00bfd74c	csinc w20,w20,wzr,eq
00bfd750	tbz w22,#0x4,0x00bfd6e4
00bfd754	ldr x1,[x21, #0x10]
00bfd758	mov w0,w19
00bfd75c	bl 0x00c437d0
00bfd760	cmp w0,#0x0
00bfd764	csinc w20,w20,wzr,eq
00bfd768	tbz w22,#0x5,0x00bfd6e8
00bfd76c	ldr x1,[x21, #0x10]
00bfd770	mov w0,w19
00bfd774	bl 0x00c43ac0
00bfd778	cmp w0,#0x0
00bfd77c	csinc w20,w20,wzr,eq
00bfd780	tbz w22,#0x6,0x00bfd6ec
00bfd784	ldr x1,[x21, #0x10]
00bfd788	mov w0,w19
00bfd78c	bl 0x00c439b0
00bfd790	cmp w0,#0x0
00bfd794	csinc w20,w20,wzr,eq
00bfd798	tbz w22,#0x7,0x00bfd6f0
00bfd79c	ldr x1,[x21, #0x10]
00bfd7a0	mov w0,w19
00bfd7a4	bl 0x00c43870
00bfd7a8	cmp w0,#0x0
00bfd7ac	csinc w20,w20,wzr,eq
00bfd7b0	tbz w22,#0x8,0x00bfd6f4
00bfd7b4	ldr x1,[x21, #0x10]
00bfd7b8	mov w0,w19
00bfd7bc	bl 0x00c43ba0
00bfd7c0	cmp w0,#0x0
00bfd7c4	csinc w20,w20,wzr,eq
00bfd7c8	tbnz w22,#0x9,0x00bfd6f8
00bfd7cc	b 0x00bfd70c
