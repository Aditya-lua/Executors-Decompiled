; FUN_008ae7e4 @ 008ae7e4
008ae7e4	cmp w1,#0x1
008ae7e8	b.lt 0x008ae834
008ae7ec	stp x29,x30,[sp, #-0x20]!
008ae7f0	stp x20,x19,[sp, #0x10]
008ae7f4	mov x29,sp
008ae7f8	ldr x20,[x0, #0x60]
008ae7fc	mov w19,w1
008ae800	ldr x0,[x20, #0x620]
008ae804	bl 0x008bb19c
008ae808	ldr w8,[x20, #0x630]
008ae80c	mov w9,#0x3
008ae810	str w9,[x0, #0xc]
008ae814	and w8,w8,#0xfffffff
008ae818	ucvtf d0,w8
008ae81c	str d0,[x0]
008ae820	ldr w8,[x20, #0x630]
008ae824	bfxil w8,w19,#0x0,#0x1c
008ae828	str w8,[x20, #0x630]
008ae82c	ldp x20,x19,[sp, #0x10]
008ae830	ldp x29,x30,[sp], #0x20
008ae834	mov w0,#0xffffffff
008ae838	ret
