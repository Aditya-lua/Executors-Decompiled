; std::__ndk1::future_category @ 00bcbff4
00bcbff4	paciasp
00bcbff8	stp x29,x30,[sp, #-0x10]!
00bcbffc	mov x29,sp
00bcc000	adrp x8,0xd26000
00bcc004	add x8,x8,#0x700
00bcc008	ldarb w8,[x8]
00bcc00c	tbz w8,#0x0,0x00bcc024
00bcc010	nop
00bcc014	adr x0,0xcca5f0
00bcc018	ldp x29,x30,[sp], #0x10
00bcc01c	autiasp
00bcc020	ret
00bcc024	adrp x0,0xd26000
00bcc028	add x0,x0,#0x700
00bcc02c	bl 0x00c2fe90
00bcc030	cbz w0,0x00bcc010
00bcc034	adrp x0,0xd26000
00bcc038	add x0,x0,#0x700
00bcc03c	bl 0x00c2fea0
00bcc040	b 0x00bcc010
