; std::__ndk1::__assoc_sub_state::__make_ready @ 00bcc420
00bcc420	paciasp
00bcc424	stp x29,x30,[sp, #-0x20]!
00bcc428	str x19,[sp, #0x10]
00bcc42c	mov x29,sp
00bcc430	mov x19,x0
00bcc434	add x0,x0,#0x18
00bcc438	bl 0x00c2ff10
00bcc43c	ldr w8,[x19, #0x70]
00bcc440	add x0,x19,#0x40
00bcc444	orr w8,w8,#0x4
00bcc448	str w8,[x19, #0x70]
00bcc44c	bl 0x00c315e0
00bcc450	add x0,x19,#0x18
00bcc454	ldr x19,[sp, #0x10]
00bcc458	ldp x29,x30,[sp], #0x20
00bcc45c	autiasp
00bcc460	b 0x00c2ff20
