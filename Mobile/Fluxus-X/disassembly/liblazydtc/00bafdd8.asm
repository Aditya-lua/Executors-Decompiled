; ZSTD_frameHeaderSize @ 00bafdd8
00bafdd8	cmp x1,#0x5
00bafddc	b.cs 0x00bafde8
00bafde0	mov x0,#-0x48
00bafde4	ret
00bafde8	ldrb w8,[x0, #0x4]
00bafdec	adrp x11,0x364000
00bafdf0	add x11,x11,#0xd50
00bafdf4	and x9,x8,#0x3
00bafdf8	lsr x10,x8,#0x6
00bafdfc	cmp w8,#0x40
00bafe00	ldr x9,[x11, x9, LSL #0x3]
00bafe04	adrp x11,0x364000
00bafe08	add x11,x11,#0xe90
00bafe0c	ldr x10,[x11, x10, LSL #0x3]
00bafe10	cset w11,cc
00bafe14	ands w8,w8,#0x20
00bafe18	and w8,w11,w8, LSR #0x5
00bafe1c	add x9,x9,x10
00bafe20	cinc x9,x9,eq
00bafe24	add x8,x9,x8
00bafe28	add x0,x8,#0x5
00bafe2c	ret
