; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::reserve @ 008ec898
008ec898	stp x26,x25,[sp, #-0x50]!
008ec89c	stp x24,x23,[sp, #0x10]
008ec8a0	stp x22,x21,[sp, #0x20]
008ec8a4	stp x20,x19,[sp, #0x30]
008ec8a8	stp x29,x30,[sp, #0x40]
008ec8ac	add x29,sp,#0x40
008ec8b0	cmn x1,#0x10
008ec8b4	mov x19,x0
008ec8b8	b.cs 0x008ec9dc
008ec8bc	ldrb w24,[x19]
008ec8c0	tbnz w24,#0x0,0x008ec8d0
008ec8c4	lsr w22,w24,#0x1
008ec8c8	mov w8,#0x16
008ec8cc	b 0x008ec8dc
008ec8d0	ldp x8,x22,[x19]
008ec8d4	and x8,x8,#-0x2
008ec8d8	sub x8,x8,#0x1
008ec8dc	cmp x22,x1
008ec8e0	csel x9,x22,x1,hi
008ec8e4	cmp x9,#0x17
008ec8e8	b.cs 0x008ec918
008ec8ec	mov w23,#0x16
008ec8f0	cmp x23,x8
008ec8f4	b.eq 0x008ec9c4
008ec8f8	cmp x23,#0x16
008ec8fc	b.ne 0x008ec930
008ec900	ldr x21,[x19, #0x10]
008ec904	add x20,x19,#0x1
008ec908	mov w25,wzr
008ec90c	tbnz w24,#0x0,0x008ec97c
008ec910	mov w26,#0x1
008ec914	b 0x008ec964
008ec918	add x9,x9,#0x10
008ec91c	and x9,x9,#-0x10
008ec920	sub x23,x9,#0x1
008ec924	cmp x23,x8
008ec928	b.ne 0x008ec8f8
008ec92c	b 0x008ec9c4
008ec930	cmp x23,x8
008ec934	add x0,x23,#0x1
008ec938	b.ls 0x008ec94c
008ec93c	bl 0x00c2fed0
008ec940	mov x20,x0
008ec944	tbz w24,#0x0,0x008ec958
008ec948	b 0x008ec974
008ec94c	bl 0x00c2fed0
008ec950	mov x20,x0
008ec954	tbnz w24,#0x0,0x008ec974
008ec958	mov w26,wzr
008ec95c	add x21,x19,#0x1
008ec960	mov w25,#0x1
008ec964	lsr w8,w24,#0x1
008ec968	adds x2,x8,#0x1
008ec96c	b.ne 0x008ec98c
008ec970	b 0x008ec998
008ec974	ldr x21,[x19, #0x10]
008ec978	mov w25,#0x1
008ec97c	ldr x8,[x19, #0x8]
008ec980	mov w26,#0x1
008ec984	adds x2,x8,#0x1
008ec988	b.eq 0x008ec998
008ec98c	mov x0,x20
008ec990	mov x1,x21
008ec994	bl 0x00c2ffd0
008ec998	cbz w26,0x008ec9a4
008ec99c	mov x0,x21
008ec9a0	bl 0x00c301d0
008ec9a4	cbz w25,0x008ec9bc
008ec9a8	add x8,x23,#0x1
008ec9ac	orr x8,x8,#0x1
008ec9b0	stp x8,x22,[x19]
008ec9b4	str x20,[x19, #0x10]
008ec9b8	b 0x008ec9c4
008ec9bc	lsl w8,w22,#0x1
008ec9c0	strb w8,[x19]
008ec9c4	ldp x29,x30,[sp, #0x40]
008ec9c8	ldp x20,x19,[sp, #0x30]
008ec9cc	ldp x22,x21,[sp, #0x20]
008ec9d0	ldp x24,x23,[sp, #0x10]
008ec9d4	ldp x26,x25,[sp], #0x50
008ec9d8	ret
008ec9dc	mov x0,x19
008ec9e0	bl 0x00c30ce0
