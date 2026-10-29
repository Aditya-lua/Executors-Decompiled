/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d78c0..0x3d7a78 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d78c0_1 {
    struct st_3d78c0_1 *field_0;
    long long field_1;
    long long field_2;
} st_3d78c0_1;

typedef struct st_3d78c0_0 {
    struct st_3d78c0_0 *field_0;
    char field_1;
    char field_2;
} st_3d78c0_0;

typedef struct st_3d78c0_2 {
    char field_0;
} st_3d78c0_2;


long long sub_3d78c0(unsigned long a0, st_3d78c0_0 **a1, long long *a2, st_3d78c0_0 **a3, st_3d78c0_0 **a4)
{
    st_3d78c0_0 *ptr;  // x22
    st_3d78c0_0 *ptr1;  // x0
    st_3d78c0_1 *v6;  // x23
    st_3d78c0_0 *ptr2;  // x0
    st_3d78c0_0 *v8;  // x0
    st_3d78c0_0 *v9;  // x0
    st_3d78c0_0 *v10;  // x0
    st_3d78c0_0 *v11;  // x0
    st_3d78c0_0 *v12;  // x0
    st_3d78c0_2 **v0;  // [bp-0x60], Other Possible Types: char
    st_3d78c0_2 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    *a1 = 0;
    *a2 = 0;
    *a3 = 0;
    ptr = sub_3d7a78();
    if (ptr && (ptr1 = _strchr(ptr, 58), ptr1))
    {
        v6 = ptr1;
        *(char *)&ptr1->field_0 = 0;
        if (!_strcmp(ptr, "http"))
        {
            *(unsigned int *)a4 = 0;
            if (*((char *)&v6->field_0 + 1) == 47)
            {
LABEL_3d7980:
                if (*((char *)&v6->field_0 + 2) == 47)
                {
                    ptr2 = _strchr((char *)&v6->field_0 + 3, 47);
                    if (ptr2)
                    {
                        *a3 = sub_3d7a78();
                        *(char *)&ptr2->field_0 = 0;
                        if (*a3)
                            goto LABEL_3d79cc;
                    }
                    else
                    {
                        v8 = sub_3d7a78("/");
                        *a3 = v8;
                        if (v8)
                        {
LABEL_3d79cc:
                            v9 = _strchr((char *)&v6->field_0 + 3, 58);
                            if (v9)
                            {
                                *(char *)&v9->field_0 = 0;
                                v10 = (char *)&v9->field_0 + 1;
                            }
                            else
                            {
                                if (!*(int *)a4)
                                    v10 = "80";
                                else
                                    v10 = "443";
                            }
                            v11 = sub_3d7a78(v10);
                            *a2 = v11;
                            if (v11)
                            {
                                v12 = sub_3d7a78((char *)&v6->field_0 + 3);
                                *a1 = v12;
                                if (v12)
                                {
                                    _free(ptr);
                                    return 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        else if (!_strcmp(ptr, "https") && (*(unsigned int *)a4 = 1, *((char *)&v6->field_0 + 1) == 47))
        {
            goto LABEL_3d7980;
        }
    }
    _free(ptr);
    _free(*a3);
    _free(*a2);
    _free(*a1);
    *a1 = 0;
    *a2 = 0;
    *a3 = 0;
    return 0;
}
