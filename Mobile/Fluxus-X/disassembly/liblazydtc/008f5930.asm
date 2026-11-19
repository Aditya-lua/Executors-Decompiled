; std::__ndk1::__assoc_state<cpr::Response>::~__assoc_state @ 008f5930
008f5930	stp x20,x19,[sp, #-0x20]!
008f5934	stp x29,x30,[sp, #0x10]
008f5938	add x29,sp,#0x10
008f593c	adrp x8,0xcb4000
008f5940	ldr x8,[x8, #0xd48]
008f5944	mov x19,x0
008f5948	mov x20,x0
008f594c	add x0,x0,#0x40
008f5950	add x8,x8,#0x10
008f5954	str x8,[x20], #0x10
008f5958	bl 0x00c31600
008f595c	add x0,x19,#0x18
008f5960	bl 0x00c2fee0
008f5964	mov x0,x20
008f5968	bl 0x00c31450
008f596c	mov x0,x19
008f5970	bl 0x00c31530
008f5974	ldp x29,x30,[sp, #0x10]
008f5978	mov x0,x19
008f597c	ldp x20,x19,[sp], #0x20
008f5980	b 0x00c301d0
