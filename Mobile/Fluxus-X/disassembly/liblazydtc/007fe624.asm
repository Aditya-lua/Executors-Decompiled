; FUN_007fe624 @ 007fe624
007fe624	stp x29,x30,[sp, #-0x20]!
007fe628	stp x20,x19,[sp, #0x10]
007fe62c	mov x29,sp
007fe630	adrp x20,0xcb4000
007fe634	mov x19,x0
007fe638	ldr x20,[x20, #0x9a0]
007fe63c	ldr x8,[x20]
007fe640	ldr x9,[x20, #0x18]
007fe644	str x8,[x0]
007fe648	ldur x8,[x8, #-0x18]
007fe64c	str x9,[x0, x8#0x0]
007fe650	add x0,x0,#0x10
007fe654	bl 0x00c300d0
007fe658	add x1,x20,#0x8
007fe65c	mov x0,x19
007fe660	bl 0x00c300e0
007fe664	add x0,x19,#0xb8
007fe668	ldp x20,x19,[sp, #0x10]
007fe66c	ldp x29,x30,[sp], #0x20
007fe670	b 0x00c300f0
