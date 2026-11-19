; std::__ndk1::__assoc_sub_state::wait @ 00bcc5e0
00bcc5e0	paciasp
00bcc5e4	sub sp,sp,#0x30
00bcc5e8	stp x29,x30,[sp, #0x10]
00bcc5ec	stp x20,x19,[sp, #0x20]
00bcc5f0	add x29,sp,#0x10
00bcc5f4	add x20,x0,#0x18
00bcc5f8	mov x19,x0
00bcc5fc	mov w8,#0x1
00bcc600	mov x0,x20
00bcc604	str x20,[sp]
00bcc608	strb w8,[sp, #0x8]
00bcc60c	bl 0x00c2ff10
00bcc610	ldr w8,[x19, #0x70]
00bcc614	tbnz w8,#0x2,0x00bcc638
00bcc618	tbnz w8,#0x3,0x00bcc654
00bcc61c	add x0,x19,#0x40
00bcc620	mov x1,sp
00bcc624	bl 0x00c33250
00bcc628	ldrb w8,[x19, #0x70]
00bcc62c	tbz w8,#0x2,0x00bcc61c
00bcc630	ldrb w8,[sp, #0x8]
00bcc634	tbz w8,#0x0,0x00bcc640
00bcc638	ldr x0,[sp]
00bcc63c	bl 0x00c2ff20
00bcc640	ldp x20,x19,[sp, #0x20]
00bcc644	ldp x29,x30,[sp, #0x10]
00bcc648	add sp,sp,#0x30
00bcc64c	autiasp
00bcc650	ret
00bcc654	and w8,w8,#0xfffffff3
00bcc658	mov x0,x20
00bcc65c	str w8,[x19, #0x70]
00bcc660	bl 0x00c2ff20
00bcc664	ldr x8,[x19]
00bcc668	ldr x16,[x8, #0x18]
00bcc66c	mov x0,x19
00bcc670	ldp x20,x19,[sp, #0x20]
00bcc674	ldp x29,x30,[sp, #0x10]
00bcc678	add sp,sp,#0x30
00bcc67c	autiasp
00bcc680	br x16
