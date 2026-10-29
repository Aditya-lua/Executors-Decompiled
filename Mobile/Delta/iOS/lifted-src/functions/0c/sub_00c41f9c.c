/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc41f9c..0xc42004 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f14410;
extern long long g_f14428;

unsigned long long sub_c41f9c(void)
{
    unsigned long long count;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    /* unsupported instruction */;
    if (g_f14428)
    {
        count = _pthread_mutex_lock(g_f14428);
        if ((unsigned int)count)
            goto LABEL_c41ff4;
LABEL_c41fbc:
        if (!(g_f14410 & 0x7fffffffffffffff))
            return 0;
    }
    else
    {
        count = _pthread_mutex_lock(sub_c76a3c(&g_f14428));
        if (!(unsigned int)count)
            goto LABEL_c41fbc;
LABEL_c41ff4:
        count = sub_c76c78();
    }
    return sub_c76a10(count) ^ 1;
}
