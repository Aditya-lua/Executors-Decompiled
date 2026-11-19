; FUN_00c12fcc @ 00c12fcc
00c12fcc	paciasp
00c12fd0	stp x29,x30,[sp, #-0x40]!
00c12fd4	str x23,[sp, #0x10]
00c12fd8	stp x22,x21,[sp, #0x20]
00c12fdc	stp x20,x19,[sp, #0x30]
00c12fe0	mov x29,sp
00c12fe4	ldp x21,x8,[x0, #0x8]
00c12fe8	cmp x21,x8
00c12fec	b.ne 0x00c13078
00c12ff0	mov x8,x0
00c12ff4	mov x22,x1
00c12ff8	mov x23,x0
00c12ffc	ldr x20,[x8], #0x18
00c13000	sub x19,x21,x20
00c13004	cmp x20,x8
00c13008	lsl x1,x19,#0x1
00c1300c	b.eq 0x00c1302c
00c13010	mov x0,x20
00c13014	bl 0x00c30950
00c13018	mov x8,x0
00c1301c	mov x0,x23
00c13020	str x8,[x23]
00c13024	cbnz x8,0x00c13064
00c13028	bl 0x00c30b40
00c1302c	mov x0,x1
00c13030	bl 0x00c308d0
00c13034	cbz x0,0x00c1309c
00c13038	mov x8,x0
00c1303c	cmp x21,x20
00c13040	b.eq 0x00c1305c
00c13044	mov x0,x8
00c13048	mov x1,x20
00c1304c	mov x2,x19
00c13050	mov x21,x8
00c13054	bl 0x00c2ff60
00c13058	mov x8,x21
00c1305c	mov x0,x23
00c13060	str x8,[x23]
00c13064	asr x9,x19,#0x2
00c13068	add x21,x8,x19
00c1306c	mov x1,x22
00c13070	add x9,x8,x9, LSL #0x3
00c13074	str x9,[x0, #0x10]
00c13078	ldr x8,[x1]
00c1307c	str x8,[x21], #0x8
00c13080	str x21,[x0, #0x8]
00c13084	ldp x20,x19,[sp, #0x30]
00c13088	ldr x23,[sp, #0x10]
00c1308c	ldp x22,x21,[sp, #0x20]
00c13090	ldp x29,x30,[sp], #0x40
00c13094	autiasp
00c13098	ret
00c1309c	bl 0x00c30b40
