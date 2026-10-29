/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadf9c0..0xadfae0 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adf9c0_0 {
    struct st_adf9c0_0 *field_0;
    struct st_adf9c0_0 *field_8;
} st_adf9c0_0;

extern long long g_eb5038;

st_adf9c0_0 * sub_adf9c0(unsigned long a0, st_adf9c0_0 *a1, unsigned long a2, unsigned long a3, unsigned long a4)
{
    st_adf9c0_0 *v3;  // x0
    st_adf9c0_0 *v4;  // x8
    st_adf9c0_0 *v5;  // x22
    st_adf9c0_0 *v6;  // x0
    st_adf9c0_0 *v7;  // x8
    st_adf9c0_0 *v8;  // x0
    long long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_adf884();
    if (!v3 || !(v4 = v3->field_8, v4))
        return 0;
    if ((int)v4->field_0 == 1)
    {
        v5 = v4->field_8;
        if (v5)
            goto LABEL_adfa6c;
LABEL_adfa18:
        v6 = sub_ad61b4();
        if (v6)
        {
            v5 = v6;
            if (a1 != 1 && a1 != 2)
                goto LABEL_adfa5c;
            sub_ad5f30(v5);
LABEL_adfa5c:
            v7 = v3->field_8;
            *(unsigned int *)&v7->field_0 = 1;
            v7->field_8 = v5;
LABEL_adfa6c:
            v8 = sub_adfae0();
            if (!(unsigned int)v8)
                return v8;
            if (sub_ad68a0(v5, v0))
                return 1;
            sub_9cd960(v0, &g_eb5038);
        }
    }
    else if ((int)v4->field_0 || !v4->field_8)
    {
        goto LABEL_adfa18;
    }
    return 0;
}
