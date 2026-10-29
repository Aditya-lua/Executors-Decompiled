/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96783c..0x967990 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96783c_1 {
    char padding_0[2304];
    struct st_96783c_0 *field_900;
} st_96783c_1;

typedef struct st_96783c_0 {
    char padding_0[888];
    char field_378;
} st_96783c_0;

extern char g_10002b0;

char sub_96783c(st_96783c_1 *a0, long long a1, long long a2, long long a3, long long *a4)
{
    char v6;  // w0
    long long v0;  // [bp-0xd8]
    long long v1;  // [bp-0xd0]
    char v2;  // [bp-0xc8]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v3 = *(long long *)&g_10002b0;
    if (!(a0->field_900->field_378 & 1))
    {
        *(unsigned int *)&v0 = 1;
        v6 = sub_9674f0(a0, "master secret", 13, &a0->padding_0[392], 32, 0, 0, &a0->padding_0[360], 32, a2, a3, a1, 48, v0);
        if (v6)
            goto LABEL_967948;
    }
    else if (sub_9545a8(a0, 1) && sub_962d78(a0, &v2, 128, &v1) && !(*(unsigned int *)&v0 = 1, !sub_9674f0(a0, "extended master secret", 22, &v2, v1, 0, 0, 0, 0, a2, a3, a1, 48, v0)))
    {
        sub_a66ec0(&v2, v1);
LABEL_967948:
        *a4 = 48;
        v6 = 1;
    }
    else
    {
        v6 = 0;
    }
    if (*(long long *)&g_10002b0 == v3)
        return v6;
    ___stack_chk_fail();
}
