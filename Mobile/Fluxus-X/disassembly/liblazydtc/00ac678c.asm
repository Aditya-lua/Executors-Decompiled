; ossl_property_match_count @ 00ac678c
00ac678c	str x27,[sp, #-0x60]!
00ac6790	stp x26,x25,[sp, #0x10]
00ac6794	stp x24,x23,[sp, #0x20]
00ac6798	stp x22,x21,[sp, #0x30]
00ac679c	stp x20,x19,[sp, #0x40]
00ac67a0	stp x29,x30,[sp, #0x50]
00ac67a4	ldrsw x22,[x0]
00ac67a8	add x29,sp,#0x50
00ac67ac	cmp w22,#0x1
00ac67b0	b.lt 0x00ac68ec
00ac67b4	mov x20,x1
00ac67b8	mov x23,xzr
00ac67bc	mov w26,wzr
00ac67c0	mov w19,wzr
00ac67c4	add x24,x0,#0x18
00ac67c8	orr w25,wzr,#0x18
00ac67cc	madd x8,x23,x25,x20
00ac67d0	add x8,x8,#0x8
00ac67d4	mov w9,w26
00ac67d8	sxtw x26,w9
00ac67dc	smaddl x21,w9,w25,x24
00ac67e0	ldur w27,[x21, #-0x8]
00ac67e4	cmp w27,#0x2
00ac67e8	b.ne 0x00ac6800
00ac67ec	add x26,x26,#0x1
00ac67f0	cmp x26,x22
00ac67f4	add x21,x21,#0x18
00ac67f8	b.lt 0x00ac67e0
00ac67fc	b 0x00ac68f0
00ac6800	ldrsw x9,[x20]
00ac6804	cmp x23,x9
00ac6808	b.ge 0x00ac6820
00ac680c	ldur w9,[x21, #-0x10]
00ac6810	ldr w10,[x8]
00ac6814	cmp w9,w10
00ac6818	b.gt 0x00ac68dc
00ac681c	b.eq 0x00ac6880
00ac6820	ldur w9,[x21, #-0xc]
00ac6824	cbz w9,0x00ac683c
00ac6828	cmp w9,#0x2
00ac682c	b.ne 0x00ac6854
00ac6830	cmp w27,#0x1
00ac6834	b.ne 0x00ac6854
00ac6838	b 0x00ac686c
00ac683c	cmp w27,#0x1
00ac6840	b.eq 0x00ac6860
00ac6844	cbnz w27,0x00ac686c
00ac6848	ldr w9,[x21]
00ac684c	cmp w9,#0x2
00ac6850	b.eq 0x00ac686c
00ac6854	ldurb w9,[x21, #-0x4]
00ac6858	tbnz w9,#0x0,0x00ac6870
00ac685c	b 0x00ac6910
00ac6860	ldr w9,[x21]
00ac6864	cmp w9,#0x2
00ac6868	b.eq 0x00ac6854
00ac686c	add w19,w19,#0x1
00ac6870	add w9,w26,#0x1
00ac6874	cmp w9,w22
00ac6878	b.lt 0x00ac67d8
00ac687c	b 0x00ac68f0
00ac6880	madd x9,x23,x25,x20
00ac6884	ldur w8,[x21, #-0xc]
00ac6888	ldr w9,[x9, #0xc]
00ac688c	cmp w8,w9
00ac6890	mov w8,wzr
00ac6894	b.ne 0x00ac68bc
00ac6898	madd x8,x23,x25,x20
00ac689c	add x1,x8,#0x18
00ac68a0	mov w2,#0x8
00ac68a4	mov x0,x21
00ac68a8	bl 0x00c300b0
00ac68ac	cmp w0,#0x0
00ac68b0	orr w9,w0,w27
00ac68b4	cset w8,eq
00ac68b8	cbz w9,0x00ac68c8
00ac68bc	cmp w27,#0x1
00ac68c0	b.ne 0x00ac68d0
00ac68c4	cbnz w8,0x00ac68d0
00ac68c8	add w19,w19,#0x1
00ac68cc	b 0x00ac68d8
00ac68d0	ldurb w8,[x21, #-0x4]
00ac68d4	tbz w8,#0x0,0x00ac6910
00ac68d8	add w26,w26,#0x1
00ac68dc	cmp w26,w22
00ac68e0	add x23,x23,#0x1
00ac68e4	b.lt 0x00ac67cc
00ac68e8	b 0x00ac68f0
00ac68ec	mov w19,wzr
00ac68f0	mov w0,w19
00ac68f4	ldp x29,x30,[sp, #0x50]
00ac68f8	ldp x20,x19,[sp, #0x40]
00ac68fc	ldp x22,x21,[sp, #0x30]
00ac6900	ldp x24,x23,[sp, #0x20]
00ac6904	ldp x26,x25,[sp, #0x10]
00ac6908	ldr x27,[sp], #0x60
00ac690c	ret
00ac6910	mov w19,#0xffffffff
00ac6914	b 0x00ac68f0
