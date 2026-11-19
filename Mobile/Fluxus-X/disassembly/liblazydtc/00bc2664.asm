; std::nested_exception::nested_exception @ 00bc2664
00bc2664	paciasp
00bc2668	stp x29,x30,[sp, #-0x20]!
00bc266c	str x19,[sp, #0x10]
00bc2670	mov x29,sp
00bc2674	adrp x8,0xcb5000
00bc2678	mov x19,x0
00bc267c	ldr x8,[x8, #0xae0]
00bc2680	add x8,x8,#0x10
00bc2684	str x8,[x0]
00bc2688	bl 0x00c43c60
00bc268c	str x0,[x19, #0x8]
00bc2690	ldr x19,[sp, #0x10]
00bc2694	ldp x29,x30,[sp], #0x20
00bc2698	autiasp
00bc269c	ret
