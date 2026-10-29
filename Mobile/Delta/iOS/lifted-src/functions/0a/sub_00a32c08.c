/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa32c08..0xa32c78 (112 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a32c08_0 {
    unsigned long long field_0;
} st_a32c08_0;


long long sub_a32c08(st_a32c08_0 **a0)
{
    unsigned long long *v2;  // w9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned long long *)(int)a0[20];
    if (!(int)a0[20])
    {
        if (a0[12])
            a0[12]();
        v2 = (unsigned long long *)0;
    }
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    *(unsigned int *)&a0[20] = (unsigned int)(unsigned long long *)((char *)v2 + 1);
    return 1;
}
