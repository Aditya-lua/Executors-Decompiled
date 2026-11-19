; FUN_00c0affc @ 00c0affc
00c0affc	paciasp
00c0b000	stp x29,x30,[sp, #-0x20]!
00c0b004	str x19,[sp, #0x10]
00c0b008	mov x29,sp
00c0b00c	adrp x8,0xcb5000
00c0b010	mov x19,x0
00c0b014	ldr x8,[x8, #0xde8]
00c0b018	ldrb w9,[x0, #0x60]
00c0b01c	add x8,x8,#0x10
00c0b020	str x8,[x0]
00c0b024	tbnz w9,#0x0,0x00c0b064
00c0b028	ldrb w8,[x19, #0x48]
00c0b02c	tbnz w8,#0x0,0x00c0b07c
00c0b030	ldrb w8,[x19, #0x30]
00c0b034	tbnz w8,#0x0,0x00c0b094
00c0b038	ldrb w8,[x19, #0x18]
00c0b03c	tbz w8,#0x0,0x00c0b050
00c0b040	ldr x8,[x19, #0x18]
00c0b044	ldr x0,[x19, #0x28]
00c0b048	and x1,x8,#-0x2
00c0b04c	bl 0x00c2fe80
00c0b050	mov x0,x19
00c0b054	ldr x19,[sp, #0x10]
00c0b058	ldp x29,x30,[sp], #0x20
00c0b05c	autiasp
00c0b060	b 0x00c31530
00c0b064	ldr x8,[x19, #0x60]
00c0b068	ldr x0,[x19, #0x70]
00c0b06c	and x1,x8,#-0x2
00c0b070	bl 0x00c2fe80
00c0b074	ldrb w8,[x19, #0x48]
00c0b078	tbz w8,#0x0,0x00c0b030
00c0b07c	ldr x8,[x19, #0x48]
00c0b080	ldr x0,[x19, #0x58]
00c0b084	and x1,x8,#-0x2
00c0b088	bl 0x00c2fe80
00c0b08c	ldrb w8,[x19, #0x30]
00c0b090	tbz w8,#0x0,0x00c0b038
00c0b094	ldr x8,[x19, #0x30]
00c0b098	ldr x0,[x19, #0x40]
00c0b09c	and x1,x8,#-0x2
00c0b0a0	bl 0x00c2fe80
00c0b0a4	ldrb w8,[x19, #0x18]
00c0b0a8	tbnz w8,#0x0,0x00c0b040
00c0b0ac	b 0x00c0b050
