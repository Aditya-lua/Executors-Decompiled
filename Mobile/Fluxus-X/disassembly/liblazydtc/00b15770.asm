; NETSCAPE_SPKI_verify @ 00b15770
00b15770	stp x20,x19,[sp, #-0x20]!
00b15774	stp x29,x30,[sp, #0x10]
00b15778	add x29,sp,#0x10
00b1577c	mov x19,x1
00b15780	mov x20,x0
00b15784	bl 0x00c38330
00b15788	ldr x2,[x20, #0x18]
00b1578c	ldr x3,[x20]
00b15790	ldp x29,x30,[sp, #0x10]
00b15794	add x1,x20,#0x8
00b15798	mov x4,x19
00b1579c	ldp x20,x19,[sp], #0x20
00b157a0	b 0x00c37b00
