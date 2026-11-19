; SSL_has_matching_session_id @ 009b2654
009b2654	stp x28,x19,[sp, #-0x20]!
009b2658	stp x29,x30,[sp, #0x10]
009b265c	add x29,sp,#0x10
009b2660	sub sp,sp,#0x3a0
009b2664	mov x19,x0
009b2668	cmp w2,#0x20
009b266c	mov w0,wzr
009b2670	b.hi 0x009b26cc
009b2674	ldr w8,[x19]
009b2678	mov x9,sp
009b267c	mov w2,w2
009b2680	add x0,x9,#0x258
009b2684	str w8,[sp]
009b2688	str x2,[sp, #0x250]
009b268c	bl 0x00c2ffd0
009b2690	ldr x8,[x19, #0xb88]
009b2694	ldr x0,[x8, #0x3c8]
009b2698	bl 0x00c35680
009b269c	cbz w0,0x009b26cc
009b26a0	ldr x8,[x19, #0xb88]
009b26a4	mov x1,sp
009b26a8	ldr x0,[x8, #0x30]
009b26ac	bl 0x00c34de0
009b26b0	ldr x8,[x19, #0xb88]
009b26b4	mov x19,x0
009b26b8	ldr x8,[x8, #0x3c8]
009b26bc	mov x0,x8
009b26c0	bl 0x00c35690
009b26c4	cmp x19,#0x0
009b26c8	cset w0,ne
009b26cc	add sp,sp,#0x3a0
009b26d0	ldp x29,x30,[sp, #0x10]
009b26d4	ldp x28,x19,[sp], #0x20
009b26d8	ret
