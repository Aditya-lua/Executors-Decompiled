; FUN_008dd914 @ 008dd914
008dd914	ldr x8,[x0, #0x8]
008dd918	cbz x8,0x008dd928
008dd91c	clz x8,x8
008dd920	eor w0,w8,#0x7f
008dd924	ret
008dd928	ldr x8,[x0]
008dd92c	mov w9,#0x3f
008dd930	clz x8,x8
008dd934	sub w0,w9,w8
008dd938	ret
