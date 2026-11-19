; FUN_00c0cfe8 @ 00c0cfe8
00c0cfe8	paciasp
00c0cfec	stp x29,x30,[sp, #-0x20]!
00c0cff0	stp x20,x19,[sp, #0x10]
00c0cff4	mov x29,sp
00c0cff8	ldrb w8,[x0, #0x410]
00c0cffc	mov x19,x0
00c0d000	tbnz w8,#0x0,0x00c0d0bc
00c0d004	ldrb w8,[x19, #0x3f8]
00c0d008	tbnz w8,#0x0,0x00c0d0d8
00c0d00c	ldrb w8,[x19, #0x3e0]
00c0d010	tbnz w8,#0x0,0x00c0d0f4
00c0d014	ldrb w8,[x19, #0x3c8]
00c0d018	tbnz w8,#0x0,0x00c0d110
00c0d01c	ldrb w8,[x19, #0x3b0]
00c0d020	tbnz w8,#0x0,0x00c0d12c
00c0d024	ldrb w8,[x19, #0x398]
00c0d028	tbz w8,#0x0,0x00c0d040
00c0d02c	ldr x8,[x19, #0x398]
00c0d030	ldr x0,[x19, #0x3a8]
00c0d034	lsl x8,x8,#0x2
00c0d038	and x1,x8,#-0x8
00c0d03c	bl 0x00c2fe80
00c0d040	mov w20,#0x240
00c0d044	b 0x00c0d050
00c0d048	subs x20,x20,#0x18
00c0d04c	b.eq 0x00c0d080
00c0d050	add x8,x19,x20
00c0d054	ldrb w9,[x8, #0x140]
00c0d058	tbz w9,#0x0,0x00c0d048
00c0d05c	ldr x9,[x8, #0x140]
00c0d060	ldr x0,[x8, #0x150]
00c0d064	lsl x8,x9,#0x2
00c0d068	and x1,x8,#-0x8
00c0d06c	bl 0x00c2fe80
00c0d070	b 0x00c0d048
00c0d074	sub x20,x20,#0x18
00c0d078	cmn x20,#0x150
00c0d07c	b.eq 0x00c0d0a4
00c0d080	add x8,x19,x20
00c0d084	ldrb w9,[x8, #0x140]
00c0d088	tbz w9,#0x0,0x00c0d074
00c0d08c	ldr x9,[x8, #0x140]
00c0d090	ldr x0,[x8, #0x150]
00c0d094	lsl x8,x9,#0x2
00c0d098	and x1,x8,#-0x8
00c0d09c	bl 0x00c2fe80
00c0d0a0	b 0x00c0d074
00c0d0a4	ldr x0,[x19]
00c0d0a8	bl 0x00c43980
00c0d0ac	ldp x20,x19,[sp, #0x10]
00c0d0b0	ldp x29,x30,[sp], #0x20
00c0d0b4	autiasp
00c0d0b8	ret
00c0d0bc	ldr x8,[x19, #0x410]
00c0d0c0	ldr x0,[x19, #0x420]
00c0d0c4	lsl x8,x8,#0x2
00c0d0c8	and x1,x8,#-0x8
00c0d0cc	bl 0x00c2fe80
00c0d0d0	ldrb w8,[x19, #0x3f8]
00c0d0d4	tbz w8,#0x0,0x00c0d00c
00c0d0d8	ldr x8,[x19, #0x3f8]
00c0d0dc	ldr x0,[x19, #0x408]
00c0d0e0	lsl x8,x8,#0x2
00c0d0e4	and x1,x8,#-0x8
00c0d0e8	bl 0x00c2fe80
00c0d0ec	ldrb w8,[x19, #0x3e0]
00c0d0f0	tbz w8,#0x0,0x00c0d014
00c0d0f4	ldr x8,[x19, #0x3e0]
00c0d0f8	ldr x0,[x19, #0x3f0]
00c0d0fc	lsl x8,x8,#0x2
00c0d100	and x1,x8,#-0x8
00c0d104	bl 0x00c2fe80
00c0d108	ldrb w8,[x19, #0x3c8]
00c0d10c	tbz w8,#0x0,0x00c0d01c
00c0d110	ldr x8,[x19, #0x3c8]
00c0d114	ldr x0,[x19, #0x3d8]
00c0d118	lsl x8,x8,#0x2
00c0d11c	and x1,x8,#-0x8
00c0d120	bl 0x00c2fe80
00c0d124	ldrb w8,[x19, #0x3b0]
00c0d128	tbz w8,#0x0,0x00c0d024
00c0d12c	ldr x8,[x19, #0x3b0]
00c0d130	ldr x0,[x19, #0x3c0]
00c0d134	lsl x8,x8,#0x2
00c0d138	and x1,x8,#-0x8
00c0d13c	bl 0x00c2fe80
00c0d140	ldrb w8,[x19, #0x398]
00c0d144	tbnz w8,#0x0,0x00c0d02c
00c0d148	b 0x00c0d040
