; FUN_00c197c0 @ 00c197c0
00c197c0	paciasp
00c197c4	stp x29,x30,[sp, #-0x30]!
00c197c8	stp x22,x21,[sp, #0x10]
00c197cc	stp x20,x19,[sp, #0x20]
00c197d0	mov x29,sp
00c197d4	ldr x22,[x0, #0x1330]
00c197d8	mov x19,x2
00c197dc	mov x20,x1
00c197e0	ldr x8,[x22, #0x8]
00c197e4	sub x9,x8,#0xfc0
00c197e8	cmn x9,#0xff1
00c197ec	b.hi 0x00c19810
00c197f0	mov x21,x0
00c197f4	mov w0,#0x1000
00c197f8	bl 0x00c308d0
00c197fc	cbz x0,0x00c19868
00c19800	mov x8,xzr
00c19804	stp x22,xzr,[x0]
00c19808	mov x22,x0
00c1980c	str x0,[x21, #0x1330]
00c19810	add x9,x8,#0x30
00c19814	add x0,x22,x8
00c19818	ldr x8,[x20]
00c1981c	str x9,[x22, #0x8]
00c19820	adrp x9,0xcb2000
00c19824	add x9,x9,#0x990
00c19828	mov w10,#0x46
00c1982c	str x9,[x0, #0x10]!
00c19830	ldurh w9,[x0, #0x9]
00c19834	strb w10,[x0, #0x8]
00c19838	mov w10,#0x540
00c1983c	str x8,[x0, #0x10]
00c19840	and w8,w9,#0xf000
00c19844	ldr q0,[x19]
00c19848	orr w8,w8,w10
00c1984c	sturh w8,[x0, #0x9]
00c19850	stur q0,[x0, #0x18]
00c19854	ldp x20,x19,[sp, #0x20]
00c19858	ldp x22,x21,[sp, #0x10]
00c1985c	ldp x29,x30,[sp], #0x30
00c19860	autiasp
00c19864	ret
00c19868	bl 0x00c2fff0
