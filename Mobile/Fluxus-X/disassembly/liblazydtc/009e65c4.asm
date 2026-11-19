; send_certificate_request @ 009e65c4
009e65c4	ldr w8,[x0, #0x968]
009e65c8	tbz w8,#0x0,0x009e6640
009e65cc	ldr x9,[x0, #0x8]
009e65d0	ldr x10,[x9, #0xc0]
009e65d4	ldrb w10,[x10, #0x60]
009e65d8	tbnz w10,#0x3,0x009e6600
009e65dc	tbz w8,#0x3,0x009e6600
009e65e0	ldr w9,[x9]
009e65e4	cmp w9,#0x304
009e65e8	b.lt 0x009e6600
009e65ec	cmp w9,#0x10, LSL #12
009e65f0	b.eq 0x009e6600
009e65f4	ldr w9,[x0, #0xba8]
009e65f8	cmp w9,#0x3
009e65fc	b.ne 0x009e6640
009e6600	tbz w8,#0x2,0x009e6610
009e6604	ldr w9,[x0, #0xbc0]
009e6608	cmp w9,#0x0
009e660c	b.gt 0x009e6640
009e6610	ldr x9,[x0, #0x2e0]
009e6614	mov w11,#0x50
009e6618	ldr w10,[x9, #0x20]
009e661c	tst w10,#0x4
009e6620	cset w9,eq
009e6624	tst w10,w11
009e6628	b.ne 0x009e6640
009e662c	and w8,w8,#0x2
009e6630	orr w8,w9,w8, LSR #0x1
009e6634	tbz w8,#0x0,0x009e6640
009e6638	mov w0,#0x1
009e663c	ret
009e6640	mov w0,wzr
009e6644	ret
