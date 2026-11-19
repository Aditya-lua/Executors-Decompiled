; FUN_0091cfd4 @ 0091cfd4
0091cfd4	lsr x8,x1,#0xc
0091cfd8	cmp x8,#0x4a
0091cfdc	b.hi 0x0091d020
0091cfe0	ldr w8,[x0, #0x1378]
0091cfe4	ldr w10,[x0, #0x10c]
0091cfe8	add w9,w8,w1
0091cfec	add w8,w10,w1
0091cff0	str w9,[x0, #0x1378]
0091cff4	str w8,[x0, #0x10c]
0091cff8	tbnz w2,#0x0,0x0091d008
0091cffc	ldr w10,[x0, #0x108]
0091d000	add w10,w10,w1
0091d004	str w10,[x0, #0x108]
0091d008	mov w3,#0xb000
0091d00c	cmp w8,#0x4b, LSL #12
0091d010	movk w3,#0x4, LSL #16
0091d014	b.ls 0x0091d058
0091d018	mov w2,w8
0091d01c	b 0x0091d034
0091d020	ldr w8,[x0, #0x10c]
0091d024	mov w3,#0xb000
0091d028	movk w3,#0x4, LSL #16
0091d02c	add x2,x8,x1
0091d030	cbz x2,0x0091d070
0091d034	stp x29,x30,[sp, #-0x10]!
0091d038	mov x29,sp
0091d03c	adrp x1,0x29f000
0091d040	add x1,x1,#0x4c3
0091d044	bl 0x00904b80
0091d048	orr w8,wzr,#0x38
0091d04c	ldp x29,x30,[sp], #0x10
0091d050	mov w0,w8
0091d054	ret
0091d058	add w3,w3,#0x591, LSL #12
0091d05c	cmp w9,w3
0091d060	mov w8,wzr
0091d064	b.ls 0x0091d074
0091d068	mov w2,w9
0091d06c	cbnz x2,0x0091d034
0091d070	mov w8,wzr
0091d074	mov w0,w8
0091d078	ret
