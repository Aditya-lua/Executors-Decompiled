; FUN_00ba1fc4 @ 00ba1fc4
00ba1fc4	stp x26,x25,[sp, #-0x50]!
00ba1fc8	stp x24,x23,[sp, #0x10]
00ba1fcc	stp x22,x21,[sp, #0x20]
00ba1fd0	stp x20,x19,[sp, #0x30]
00ba1fd4	stp x29,x30,[sp, #0x40]
00ba1fd8	add x29,sp,#0x40
00ba1fdc	mov x19,x2
00ba1fe0	mov x20,x1
00ba1fe4	cbz x2,0x00ba2038
00ba1fe8	adrp x8,0xcca000
00ba1fec	ldr w23,[x8, #0x4d8]
00ba1ff0	mov w25,#0x660d
00ba1ff4	mov w26,#0xf35f
00ba1ff8	adrp x21,0xcca000
00ba1ffc	mov w24,#0x4
00ba2000	movk w25,#0x19, LSL #16
00ba2004	movk w26,#0x3c6e, LSL #16
00ba2008	add x21,x21,#0x4d8
00ba200c	cmp x19,#0x4
00ba2010	csel x22,x19,x24,cc
00ba2014	madd w23,w23,w25,w26
00ba2018	mov x0,x20
00ba201c	mov x1,x21
00ba2020	mov x2,x22
00ba2024	str w23,[x21]
00ba2028	bl 0x00c2ffd0
00ba202c	subs x19,x19,x22
00ba2030	add x20,x20,x22
00ba2034	b.ne 0x00ba200c
00ba2038	ldp x29,x30,[sp, #0x40]
00ba203c	ldp x20,x19,[sp, #0x30]
00ba2040	ldp x22,x21,[sp, #0x20]
00ba2044	ldp x24,x23,[sp, #0x10]
00ba2048	mov w0,wzr
00ba204c	ldp x26,x25,[sp], #0x50
00ba2050	ret
