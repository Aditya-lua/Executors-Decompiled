; BN_nist_mod_521 @ 00a2981c
00a2981c	sub sp,sp,#0x90
00a29820	stp x22,x21,[sp, #0x60]
00a29824	stp x20,x19,[sp, #0x70]
00a29828	stp x29,x30,[sp, #0x80]
00a2982c	str x23,[sp, #0x50]
00a29830	ldr w23,[x1, #0x8]
00a29834	ldr x22,[x1]
00a29838	mov x19,x0
00a2983c	mov x0,x1
00a29840	add x29,sp,#0x80
00a29844	mov x21,x3
00a29848	mov x20,x1
00a2984c	bl 0x00c37f40
00a29850	cbnz w0,0x00a29868
00a29854	adrp x1,0xc5b000
00a29858	add x1,x1,#0xf50
00a2985c	mov x0,x20
00a29860	bl 0x00c369c0
00a29864	tbnz w0,#0x1f,0x00a29898
00a29868	adrp x2,0xc5b000
00a2986c	add x2,x2,#0xed8
00a29870	mov x0,x19
00a29874	mov x1,x20
00a29878	mov x3,x21
00a2987c	bl 0x00c38f30
00a29880	ldp x29,x30,[sp, #0x80]
00a29884	ldp x20,x19,[sp, #0x70]
00a29888	ldp x22,x21,[sp, #0x60]
00a2988c	ldr x23,[sp, #0x50]
00a29890	add sp,sp,#0x90
00a29894	ret
00a29898	adrp x0,0xc5b000
00a2989c	add x0,x0,#0xed8
00a298a0	mov x1,x20
00a298a4	bl 0x00c369c0
00a298a8	cbz w0,0x00a298d4
00a298ac	cmp w0,#0x1
00a298b0	b.lt 0x00a298e0
00a298b4	cmp x19,x20
00a298b8	b.eq 0x00a29b14
00a298bc	mov x0,x19
00a298c0	mov x1,x20
00a298c4	bl 0x00c36990
00a298c8	cmp x0,#0x0
00a298cc	cset w0,ne
00a298d0	b 0x00a29880
00a298d4	mov x0,x19
00a298d8	bl 0x00c38e00
00a298dc	b 0x00a29b14
00a298e0	cmp x19,x20
00a298e4	b.eq 0x00a29948
00a298e8	mov w1,#0x9
00a298ec	mov x0,x19
00a298f0	bl 0x00c38e80
00a298f4	cbz x0,0x00a29880
00a298f8	ldr x20,[x19]
00a298fc	ldr x8,[x22]
00a29900	str x8,[x20]
00a29904	ldr x8,[x22, #0x8]
00a29908	str x8,[x20, #0x8]
00a2990c	ldr x8,[x22, #0x10]
00a29910	str x8,[x20, #0x10]
00a29914	ldr x8,[x22, #0x18]
00a29918	str x8,[x20, #0x18]
00a2991c	ldr x8,[x22, #0x20]
00a29920	str x8,[x20, #0x20]
00a29924	ldr x8,[x22, #0x28]
00a29928	str x8,[x20, #0x28]
00a2992c	ldr x8,[x22, #0x30]
00a29930	str x8,[x20, #0x30]
00a29934	ldr x8,[x22, #0x38]
00a29938	str x8,[x20, #0x38]
00a2993c	ldr x8,[x22, #0x40]
00a29940	str x8,[x20, #0x40]
00a29944	b 0x00a2994c
00a29948	mov x20,x22
00a2994c	cmp w23,#0x9
00a29950	mov w8,wzr
00a29954	b.lt 0x00a299f4
00a29958	sub w8,w23,#0x8
00a2995c	cmp w8,#0x3
00a29960	mov x9,xzr
00a29964	b.ls 0x00a299c4
00a29968	lsl x9,x8,#0x3
00a2996c	add x10,x22,x9
00a29970	add x11,sp,#0x8
00a29974	add x10,x10,#0x40
00a29978	cmp x11,x10
00a2997c	b.cs 0x00a29994
00a29980	add x10,x22,#0x40
00a29984	add x9,x11,x9
00a29988	cmp x10,x9
00a2998c	mov x9,xzr
00a29990	b.cc 0x00a299c4
00a29994	and x9,x8,#0xfffffffc
00a29998	add x10,x22,#0x50
00a2999c	add x11,x11,#0x10
00a299a0	mov x12,x9
00a299a4	ldp q0,q1,[x10, #-0x10]
00a299a8	add x10,x10,#0x20
00a299ac	subs x12,x12,#0x4
00a299b0	stp q0,q1,[x11, #-0x10]
00a299b4	add x11,x11,#0x20
00a299b8	b.ne 0x00a299a4
00a299bc	cmp x9,x8
00a299c0	b.eq 0x00a299ec
00a299c4	lsl x11,x9,#0x3
00a299c8	add x10,sp,#0x8
00a299cc	add x10,x10,x11
00a299d0	add x11,x22,x11
00a299d4	add x11,x11,#0x40
00a299d8	sub x9,x8,x9
00a299dc	ldr x12,[x11], #0x8
00a299e0	subs x9,x9,#0x1
00a299e4	str x12,[x10], #0x8
00a299e8	b.ne 0x00a299dc
00a299ec	cmp w8,#0x8
00a299f0	b.hi 0x00a29a14
00a299f4	add x9,sp,#0x8
00a299f8	mov w10,#0x8
00a299fc	add x0,x9,w8, UXTW  #0x3
00a29a00	sub w8,w10,w8
00a29a04	lsl x8,x8,#0x3
00a29a08	add x2,x8,#0x8
00a29a0c	mov w1,wzr
00a29a10	bl 0x00c301c0
00a29a14	ldp x8,x9,[sp, #0x8]
00a29a18	add x2,sp,#0x8
00a29a1c	mov w3,#0x9
00a29a20	mov x0,x20
00a29a24	extr x8,x9,x8,#0x9
00a29a28	str x8,[sp, #0x8]
00a29a2c	ldr x8,[sp, #0x18]
00a29a30	mov x1,x20
00a29a34	add x21,sp,#0x8
00a29a38	mov w22,#0x9
00a29a3c	extr x9,x8,x9,#0x9
00a29a40	str x9,[sp, #0x10]
00a29a44	ldr x9,[sp, #0x20]
00a29a48	extr x8,x9,x8,#0x9
00a29a4c	str x8,[sp, #0x18]
00a29a50	ldr x8,[sp, #0x28]
00a29a54	extr x9,x8,x9,#0x9
00a29a58	str x9,[sp, #0x20]
00a29a5c	ldr x9,[sp, #0x30]
00a29a60	extr x8,x9,x8,#0x9
00a29a64	str x8,[sp, #0x28]
00a29a68	ldr x8,[sp, #0x38]
00a29a6c	extr x9,x8,x9,#0x9
00a29a70	str x9,[sp, #0x30]
00a29a74	ldr x9,[sp, #0x40]
00a29a78	extr x8,x9,x8,#0x9
00a29a7c	str x8,[sp, #0x38]
00a29a80	ldr x8,[sp, #0x48]
00a29a84	extr x9,x8,x9,#0x9
00a29a88	lsr x8,x8,#0x9
00a29a8c	stp x9,x8,[sp, #0x40]
00a29a90	ldr x8,[x20, #0x40]
00a29a94	and x8,x8,#0x1ff
00a29a98	str x8,[x20, #0x40]
00a29a9c	bl 0x00c388b0
00a29aa0	adrp x2,0x758000
00a29aa4	add x2,x2,#0xba0
00a29aa8	add x0,sp,#0x8
00a29aac	mov w3,#0x9
00a29ab0	mov x1,x20
00a29ab4	bl 0x00c38940
00a29ab8	cmp x0,#0x0
00a29abc	csel x8,x21,x20,eq
00a29ac0	ldr x9,[x8]
00a29ac4	mov x0,x19
00a29ac8	str x9,[x20]
00a29acc	ldr x9,[x8, #0x8]
00a29ad0	str x9,[x20, #0x8]
00a29ad4	ldr x9,[x8, #0x10]
00a29ad8	str x9,[x20, #0x10]
00a29adc	ldr x9,[x8, #0x18]
00a29ae0	str x9,[x20, #0x18]
00a29ae4	ldr x9,[x8, #0x20]
00a29ae8	str x9,[x20, #0x20]
00a29aec	ldr x9,[x8, #0x28]
00a29af0	str x9,[x20, #0x28]
00a29af4	ldr x9,[x8, #0x30]
00a29af8	str x9,[x20, #0x30]
00a29afc	ldr x9,[x8, #0x38]
00a29b00	str x9,[x20, #0x38]
00a29b04	ldr x8,[x8, #0x40]
00a29b08	str x8,[x20, #0x40]
00a29b0c	str w22,[x19, #0x8]
00a29b10	bl 0x00c38e40
00a29b14	mov w0,#0x1
00a29b18	b 0x00a29880
