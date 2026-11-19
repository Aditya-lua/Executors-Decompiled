; FUN_00915c9c @ 00915c9c
00915c9c	str d8,[sp, #-0x30]!
00915ca0	stp x20,x19,[sp, #0x10]
00915ca4	stp x29,x30,[sp, #0x20]
00915ca8	add x29,sp,#0x20
00915cac	ldrb w8,[x0, #0xc34]
00915cb0	movi d8,#0x0
00915cb4	mov x9,#-0x1
00915cb8	str xzr,[x0, #0xae0]
00915cbc	and w8,w8,#0xfffffffd
00915cc0	str xzr,[x0, #0xb28]
00915cc4	str xzr,[x0, #0xb20]
00915cc8	str xzr,[x0, #0xb18]
00915ccc	str xzr,[x0, #0xb10]
00915cd0	str xzr,[x0, #0xb08]
00915cd4	str xzr,[x0, #0xb00]
00915cd8	str wzr,[x0, #0x1330]
00915cdc	mov w10,#0x140c
00915ce0	str d8,[x0, #0x1328]
00915ce4	str x9,[x0, #0x1338]
00915ce8	strb w8,[x0, #0xc34]
00915cec	ldrb w8,[x0, x10]
00915cf0	adrp x20,0xcc4000
00915cf4	add x20,x20,#0x678
00915cf8	mov x19,x0
00915cfc	and w8,w8,#0xfe
00915d00	strb w8,[x0, x10]
00915d04	str wzr,[x0, #0x1378]
00915d08	str xzr,[x0, #0x1358]
00915d0c	str xzr,[x0, #0x1350]
00915d10	str xzr,[x0, #0x1348]
00915d14	str xzr,[x0, #0x1340]
00915d18	ldr x8,[x20]
00915d1c	ldr x0,[x0, #0x1360]
00915d20	blr x8
00915d24	str xzr,[x19, #0x1360]
00915d28	ldr x8,[x20]
00915d2c	ldr x0,[x19, #0x1368]
00915d30	blr x8
00915d34	mov w8,#0x137c
00915d38	mov w9,#0x13aa
00915d3c	mov x0,x19
00915d40	strb wzr,[x19, x8]
00915d44	strb wzr,[x19, x9]
00915d48	str d8,[x19, #0x13d8]
00915d4c	str xzr,[x19, #0x13e8]
00915d50	str wzr,[x19, #0x13f0]
00915d54	str xzr,[x19, #0x1370]
00915d58	str xzr,[x19, #0x1368]
00915d5c	bl 0x00968e9c
00915d60	ldp x29,x30,[sp, #0x20]
00915d64	ldp x20,x19,[sp, #0x10]
00915d68	mov w0,wzr
00915d6c	ldr d8,[sp], #0x30
00915d70	ret
