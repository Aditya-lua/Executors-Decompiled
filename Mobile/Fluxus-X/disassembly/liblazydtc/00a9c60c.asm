; WPACKET_sub_reserve_bytes__ @ 00a9c60c
00a9c60c	stp x20,x19,[sp, #-0x20]!
00a9c610	mov x20,x3
00a9c614	mov x19,x2
00a9c618	mov x8,x0
00a9c61c	stp x29,x30,[sp, #0x10]
00a9c620	add x29,sp,#0x10
00a9c624	cbz x3,0x00a9c634
00a9c628	ldrb w9,[x8, #0x30]
00a9c62c	mov w0,wzr
00a9c630	tbnz w9,#0x0,0x00a9c65c
00a9c634	add x1,x20,x1
00a9c638	mov x0,x8
00a9c63c	mov x2,x19
00a9c640	bl 0x00a9c32c
00a9c644	cbz w0,0x00a9c65c
00a9c648	ldr x8,[x19]
00a9c64c	cbz x8,0x00a9c658
00a9c650	add x8,x8,x20
00a9c654	str x8,[x19]
00a9c658	mov w0,#0x1
00a9c65c	ldp x29,x30,[sp, #0x10]
00a9c660	ldp x20,x19,[sp], #0x20
00a9c664	ret
