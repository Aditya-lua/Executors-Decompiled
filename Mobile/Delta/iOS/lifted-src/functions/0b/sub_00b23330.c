/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb23330..0xb234a0 (368 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b23330_0 {
    char padding_0[12];
    struct st_b23330_1 *field_c;
} st_b23330_0;

typedef struct st_b23330_1 {
    unsigned long long field_0;
} st_b23330_1;


unsigned long long * sub_b23330(long long a0, long long a1, long long a2, unsigned long a3, unsigned long long *a4, unsigned long a5, st_b23330_0 *a6)
{
    unsigned long long *v6;  // x20
    unsigned long long *v7;  // x0
    unsigned long long *v8;  // x20
    unsigned long long *v9;  // x0
    unsigned int v0;  // [bp-0x5c]
    unsigned long long *v1;  // [bp-0x58]
    unsigned int v2;  // [bp-0x4c]
    unsigned long long *v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = 0;
    v0 = 0xffffffff;
    if (*(int *)&(a6->padding_0)[1])
    {
        v3 = 0;
        v2 = 0xffffffff;
        if (a4)
            a4();
        v6 = sub_b22ff4(a1, a2);
        if (v6)
            v7 = sub_af949c(a0, v6);
        else
            v7 = 0;
        sub_9d0454(v6);
        return v7;
    }
    else if (a4)
    {
        a4();
    }
    else
    {
        v8 = sub_b23148(a1, a2);
        if (v8)
        {
            v9 = sub_af9544(a0, v8);
        }
        else
        {
            switch (v0)
            {
            case 16:
                sub_9c7940(v1);
                break;
            case 6:
                sub_9c3580();
                break;
            default:
                goto LABEL_b23478;
            }
LABEL_b23478:
            v9 = 0;
        }
        sub_9ca820(v8);
        return v9;
    }
}
