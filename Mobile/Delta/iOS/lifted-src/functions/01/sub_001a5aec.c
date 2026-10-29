/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a5aec..0x1a5bcc (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a5aec_0 {
    char field_0;
} st_1a5aec_0;


char * sub_1a5aec(long long a0, char *a1, char *a2)
{
    char *v4;  // x19
    char *v5;  // x0
    char *v6;  // x0
    char *v7;  // x0
    st_1a5aec_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1a5aec_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a2)
    {
        return a1;
    }
    else if (*a1 == 92)
    {
        v4 = a1 + 1;
        if (v4 != a2)
        {
            v5 = sub_1b6354();
            if (v5 != v4)
                return v5;
            v6 = sub_1b0a54(a0, v4, a2);
            if (v6 != v4)
                return v6;
            v7 = sub_1c6100(a0, v4, a2, 0);
            if (v7 != v4)
                return v7;
            return a1;
        }
        sub_1a8ad4();
    }
    else
    {
        return a1;
    }
}
